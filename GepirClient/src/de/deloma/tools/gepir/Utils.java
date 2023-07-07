package de.deloma.tools.gepir;

import java.util.Objects;

public class Utils
{

	/**
	 * Checks if given String is <code>null</code> or blank (trimmed to empty
	 * "")
	 *
	 * @param value
	 *
	 * @return
	 */
	public static boolean isBlank(final String value)
	{
		return value == null || "".equals(value.trim());
	}

	/**
	 * Checks if given String is not <code>null</code> or not blank (trimmed to
	 * empty "")
	 *
	 * @param value
	 *
	 * @return
	 */
	public static boolean isNotBlank(final String value)
	{
		return value != null && !"".equals(value.trim());
	}

	/**
	 * Checks if the given value is in the given array using equals comparison
	 *
	 * @param values
	 * @param value
	 *
	 * @return
	 */
	public static boolean contains(final Object[] values, final Object value)
	{
		Objects.requireNonNull(value, "value most not be null");
		if (values == null)
			return false;

		for (final Object v : values)
			if (value.equals(v))
				return true;

		return false;
	}

	/**
	 * left pads the given string with given char value
	 *
	 * @param value
	 * @param c
	 * @param length
	 *
	 * @return
	 */
	public static String leftPad(final String value, final int length, final char c)
	{
		if (value == null)
			return null;
		else if (value.length() >= length)
			return value;

		final StringBuilder sb = new StringBuilder(value);
		while (sb.length() < length)
			sb.insert(0, c);
		return sb.toString();
	}
}
