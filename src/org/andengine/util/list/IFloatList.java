package org.andengine.util.list;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 11:14:45 - 27.01.2012
 */
public interface IFloatList {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public abstract void add(final float pItem);
	public abstract void add(final int pIndex, final float pItem) throws ArrayIndexOutOfBoundsException;
	public abstract float get(final int pIndex) throws ArrayIndexOutOfBoundsException;
	public abstract float remove(final int pIndex) throws ArrayIndexOutOfBoundsException;
	public abstract void clear();
}