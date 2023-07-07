package de.deloma.gepir;

import java.util.ArrayList;
import java.util.List;

/**
 * Gepir client custom Company DTO
 */
public class GepirCompany
{
	private String name;

	private String gln;
	private String gcp;

	/**
	 * address lines
	 */
	private final List<String> address = new ArrayList<>();
	private String url;
	private String email;
	private String phone;
	private String fax;

	/*
	 * Constructor
	 */

	public GepirCompany()
	{

	}

	/**
	 * Checks if the gcp is valid. Checks if the optional {@link #gln} starts
	 * with the optional {@link #gcp}.
	 *
	 * @return true if {@link #gln} or {@link #gcp} is null or {@link #gln}
	 *         starts with {@link #gcp}.
	 */
	public boolean isValidGcp()
	{
		return this.gcp == null || this.gln == null || this.gln.startsWith(this.gcp);
	}

	/*
	 * getter and setter
	 */

	public String getName()
	{
		return this.name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getGln()
	{
		return this.gln;
	}

	public void setGln(final String gln)
	{
		this.gln = gln;
	}

	public String getGcp()
	{
		return this.gcp;
	}

	public void setGcp(final String gcp)
	{
		this.gcp = gcp;
	}

	public List<String> getAddress()
	{
		return this.address;
	}

	public String getUrl()
	{
		return this.url;
	}

	public void setUrl(final String url)
	{
		this.url = url;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(final String email)
	{
		this.email = email;
	}

	public String getPhone()
	{
		return this.phone;
	}

	public void setPhone(final String phone)
	{
		this.phone = phone;
	}

	public String getFax()
	{
		return this.fax;
	}

	public void setFax(final String fax)
	{
		this.fax = fax;
	}

}
