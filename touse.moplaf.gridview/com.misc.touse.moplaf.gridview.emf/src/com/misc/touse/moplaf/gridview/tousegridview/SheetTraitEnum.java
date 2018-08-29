/**
 */
package com.misc.touse.moplaf.gridview.tousegridview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sheet Trait Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage#getSheetTraitEnum()
 * @model
 * @generated
 */
public enum SheetTraitEnum implements Enumerator {
	/**
	 * The '<em><b>SHEET TRAITS NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	SHEET_TRAITS_NONE(0, "SHEET_TRAITS_NONE", "SHEET_TRAITS_NONE"),

	/**
	 * The '<em><b>SHEET TRAITS ROWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_ROWS_VALUE
	 * @generated
	 * @ordered
	 */
	SHEET_TRAITS_ROWS(1, "SHEET_TRAITS_ROWS", "SHEET_TRAITS_ROWS"),

	/**
	 * The '<em><b>SHEET TRAITS COLUMNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_COLUMNS_VALUE
	 * @generated
	 * @ordered
	 */
	SHEET_TRAITS_COLUMNS(2, "SHEET_TRAITS_COLUMNS", "SHEET_TRAITS_COLUMNS"),

	/**
	 * The '<em><b>SHEET TRAITS GRID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_GRID_VALUE
	 * @generated
	 * @ordered
	 */
	SHEET_TRAITS_GRID(4, "SHEET_TRAITS_GRID", "SHEET_TRAITS_GRID"),

	/**
	 * The '<em><b>SHEET TRAITS BARCHART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_BARCHART_VALUE
	 * @generated
	 * @ordered
	 */
	SHEET_TRAITS_BARCHART(8, "SHEET_TRAITS_BARCHART", "SHEET_TRAITS_BARCHART");

	/**
	 * The '<em><b>SHEET TRAITS NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHEET TRAITS NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHEET_TRAITS_NONE_VALUE = 0;

	/**
	 * The '<em><b>SHEET TRAITS ROWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHEET TRAITS ROWS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_ROWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHEET_TRAITS_ROWS_VALUE = 1;

	/**
	 * The '<em><b>SHEET TRAITS COLUMNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHEET TRAITS COLUMNS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_COLUMNS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHEET_TRAITS_COLUMNS_VALUE = 2;

	/**
	 * The '<em><b>SHEET TRAITS GRID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHEET TRAITS GRID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_GRID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHEET_TRAITS_GRID_VALUE = 4;

	/**
	 * The '<em><b>SHEET TRAITS BARCHART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHEET TRAITS BARCHART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHEET_TRAITS_BARCHART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHEET_TRAITS_BARCHART_VALUE = 8;

	/**
	 * An array of all the '<em><b>Sheet Trait Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SheetTraitEnum[] VALUES_ARRAY =
		new SheetTraitEnum[] {
			SHEET_TRAITS_NONE,
			SHEET_TRAITS_ROWS,
			SHEET_TRAITS_COLUMNS,
			SHEET_TRAITS_GRID,
			SHEET_TRAITS_BARCHART,
		};

	/**
	 * A public read-only list of all the '<em><b>Sheet Trait Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SheetTraitEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sheet Trait Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SheetTraitEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SheetTraitEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sheet Trait Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SheetTraitEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SheetTraitEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sheet Trait Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SheetTraitEnum get(int value) {
		switch (value) {
			case SHEET_TRAITS_NONE_VALUE: return SHEET_TRAITS_NONE;
			case SHEET_TRAITS_ROWS_VALUE: return SHEET_TRAITS_ROWS;
			case SHEET_TRAITS_COLUMNS_VALUE: return SHEET_TRAITS_COLUMNS;
			case SHEET_TRAITS_GRID_VALUE: return SHEET_TRAITS_GRID;
			case SHEET_TRAITS_BARCHART_VALUE: return SHEET_TRAITS_BARCHART;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SheetTraitEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SheetTraitEnum
