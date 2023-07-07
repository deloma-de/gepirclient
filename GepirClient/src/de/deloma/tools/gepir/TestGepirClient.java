package de.deloma.tools.gepir;

/**
 * Test class for {@link GepirClient400}.
 *
 * Add the service requester GLN via JVM argument
 * {@value #SYSTEM_PROPERTY_REQUESTER_GLN}
 *
 * @author Florian Keller, Marco Janc
 */
public class TestGepirClient
{
	private static final String SYSTEM_PROPERTY_REQUESTER_GLN = "requesterGln";

	public static void main(final String[] args) throws GepirResponseException
	{
		// left pad
		final String value = Utils.leftPad("12345678", 13, '0');
		System.out.println(value);

		final String requesterGln = System.getProperty(TestGepirClient.SYSTEM_PROPERTY_REQUESTER_GLN);

		if (Utils.isBlank(requesterGln))
			return;

		TestGepirClient.test400(requesterGln);
	}

	private static void test400(final String requesterGln) throws GepirResponseException
	{
		final AGepirClient client = new GepirClient400(requesterGln, "DE", 9, null);

		// Test - GLN
		System.out.println("GetCompanyByGln: 4012014000002");
		GepirCompany company = client.getCompanyByGln("4012014000002");
		if (company == null)
			System.out.println("No result found for gln: 4012014000002");
		else
			TestGepirClient.printCompany(company);

		// Test - GTIN with leading zero
		company = client.getCompanyByGtin("05000112548280");
		if (company == null)
			System.out.println("No result found for gtin: 05000112548280");
		else
			TestGepirClient.printCompany(company);

		// Test - GTIN without leading zero
		company = client.getCompanyByGtin("42287971");
		if (company == null)
			System.out.println("No result found for gtin: 42287971");
		else
			TestGepirClient.printCompany(company);
	}

	private static void test300(final String requesterGln) throws GepirResponseException
	{
		final GepirClient310 gc = new GepirClient310(requesterGln, "DE", 9);

		// GTIN with error codes
		// 0 - 4260133690004
		// 5 - 23325340

		final GepirCompany company = gc.getCompanyByGtin("4260133693012");
		// internal GTIN
		final GepirCompany company2 = gc.getCompanyByGtin("87126853");

		final GepirCompany company3 = gc.getCompanyByGtin("4005500310105");

		final GepirCompany company4 = gc.getCompanyByGtin("5000193000004");

		gc.test();
	}

	private static void printCompany(final GepirCompany company)
	{
		System.out.println("Name: " + company.getName());
		System.out.println("GCP: " + company.getGcp());
		System.out.println("Address: " + company.getAddress());
		System.out.println("GLN: " + company.getGln());
		System.out.println("Website: " + company.getUrl());
		System.out.println("Email: " + company.getEmail());
		System.out.println("Telefon: " + company.getPhone());
		System.out.println("Fax: " + company.getFax());
	}
}
