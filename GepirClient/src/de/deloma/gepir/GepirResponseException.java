package de.deloma.gepir;

/**
 * An exception occured on a gepir (GS1) request with the given return code.
 *
 * TODO use enumeration as response code and custom messages.
 *
 * @author Marco Janc (c) 2014
 */
public class GepirResponseException extends Exception
{
	private static final long serialVersionUID = 6538810086454129202L;

	private final int code;

	/**
	 * Return status code
	 *
	 * @param code
	 */
	public GepirResponseException(final int code)
	{
		super("Error requesting gepir service. Return code: " + code);
		this.code = code;
	}

	public int getCode()
	{
		return this.code;
	}
}