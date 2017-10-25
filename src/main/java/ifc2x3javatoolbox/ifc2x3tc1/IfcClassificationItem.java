/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcClassificationItem<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcClassificationItem extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcClassificationNotationFacet","IfcClassification","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Notation is an DEMANDED attribute - may not be null**/
	protected IfcClassificationNotationFacet Notation;
	/** ItemOf is an OPTIONAL attribute**/
	protected IfcClassification ItemOf;
	/** Title is an DEMANDED attribute - may not be null**/
	protected IfcLabel Title;
	protected SET<IfcClassificationItemRelationship> IsClassifiedItemIn_Inverse;
	protected SET<IfcClassificationItemRelationship> IsClassifyingItemIn_Inverse;
	/**
	* The default constructor.
	**/
	public IfcClassificationItem(){}

	private static final String[] attributes = new String[]{"Notation","ItemOf","Title"};

	public String[] getAttributes() {
		return IfcClassificationItem.attributes;
	}


	/**
	* Constructs a new IfcClassificationItem object using the given parameters.
	*
	* @param Notation DEMANDED parameter of type IfcClassificationNotationFacet - may not be null.
	* @param ItemOf OPTIONAL parameter of type IfcClassification
	* @param Title DEMANDED parameter of type IfcLabel - may not be null.
	**/
	public IfcClassificationItem(IfcClassificationNotationFacet Notation, IfcClassification ItemOf, IfcLabel Title)
	{
		this.Notation = Notation;
		this.ItemOf = ItemOf;
		this.Title = Title;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcClassificationItem object using the given parameters.
	*
	* @param Notation DEMANDED parameter of type IfcClassificationNotationFacet - may not be null.
	* @param ItemOf OPTIONAL parameter of type IfcClassification
	* @param Title DEMANDED parameter of type IfcLabel - may not be null.
	**/
	public void setParameters(IfcClassificationNotationFacet Notation, IfcClassification ItemOf, IfcLabel Title)
	{
		this.Notation = Notation;
		this.ItemOf = ItemOf;
		this.Title = Title;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Notation = (IfcClassificationNotationFacet) parameters.get(0);
		this.ItemOf = (IfcClassification) parameters.get(1);
		this.Title = (IfcLabel) parameters.get(2);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		IsClassifiedItemIn_Inverse = null;
		IsClassifyingItemIn_Inverse = null;
	}

	private void resolveInverses()
	{
		if(ItemOf != null)
		{
				if(ItemOf.Contains_Inverse == null)
				{
					ItemOf.Contains_Inverse = new SET<IfcClassificationItem>();
				}
				ItemOf.Contains_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcClassificationItem.nonInverseAttributes;	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	private java.util.HashSet<String> getRedefinedDerivedAttributeTypes()
	{
		java.util.HashSet<String> redefinedDerivedAttributes = new java.util.HashSet<String>();
		return redefinedDerivedAttributes;	}

	/**
 * This method returns the object IFC  STEP representation. This method is called by the IfcModel object to write IFC STEP files.
	 *
	 * @return the IFC STEP representation of this object
	**/
	public String getStepLine()
	{
		String stepString = new String("#"+this.stepLineNumber+"= ");
		stepString = stepString.concat("IFCCLASSIFICATIONITEM(");
		if(getRedefinedDerivedAttributeTypes().contains("Notation")) stepString = stepString.concat("*,");
		else{
		if(this.Notation != null)		stepString = stepString.concat(((RootInterface)this.Notation).getStepParameter(IfcClassificationNotationFacet.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ItemOf")) stepString = stepString.concat("*,");
		else{
		if(this.ItemOf != null)		stepString = stepString.concat(((RootInterface)this.ItemOf).getStepParameter(IfcClassification.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Title")) stepString = stepString.concat("*);");
		else{
		if(this.Title != null)		stepString = stepString.concat(((RootInterface)this.Title).getStepParameter(IfcLabel.class.isInterface())+");");
		else		stepString = stepString.concat("$);");
		}
		return stepString;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		return "#" + this.stepLineNumber;
	}

	/**
	 * This method returns the line number within a IFC  STEP representation. This method is called from other objects, where this one is referenced.
	 *
	 * @return the STEP line number
	**/
	public int getStepLineNumber()
	{
		return this.stepLineNumber;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepLineNumber(int number)
	{
		this.stepLineNumber = number;
	}

	/**
	* This method returns a copy of the set of the IsClassifiedItemIn_Inverse attribute.
	*
	* @return a copy of the IsClassifiedItemIn_Inverse set
	**/
	public SET<IfcClassificationItemRelationship> getIsClassifiedItemIn_Inverse()
	{
		if(this.IsClassifiedItemIn_Inverse != null)
			return new SET<IfcClassificationItemRelationship>(this.IsClassifiedItemIn_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the IsClassifyingItemIn_Inverse attribute.
	*
	* @return a copy of the IsClassifyingItemIn_Inverse set
	**/
	public SET<IfcClassificationItemRelationship> getIsClassifyingItemIn_Inverse()
	{
		if(this.IsClassifyingItemIn_Inverse != null)
			return new SET<IfcClassificationItemRelationship>(this.IsClassifyingItemIn_Inverse);
		return null;
	}

	/**
	* This method sets the Notation attribute to the given value.
	*
	* @param Notation OPTIONAL value to set
	**/
	public void setNotation(IfcClassificationNotationFacet Notation)
	{
		this.Notation = Notation;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Notation attribute.
	*
	* @return the value of Notation
	/**/
	public IfcClassificationNotationFacet getNotation()
	{
		return this.Notation;
	}

	/**
	* This method sets the ItemOf attribute to the given value.
	*
	* @param ItemOf DEMANDED value to set - may not be null
	**/
	public void setItemOf(IfcClassification ItemOf)
	{
		synchronizeInversesRemoveItemOf(this.ItemOf);
		this.ItemOf = ItemOf;
		synchronizeInversesAddItemOf(this.ItemOf);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ItemOf attribute.
	*
	* @return the value of ItemOf
	/**/
	public IfcClassification getItemOf()
	{
		return this.ItemOf;
	}

	private void synchronizeInversesAddItemOf(IfcClassification ItemOf)
	{
		if(ItemOf != null)
		{
				if(ItemOf.Contains_Inverse == null)
				{
					ItemOf.Contains_Inverse = new SET<IfcClassificationItem>();
				}
				ItemOf.Contains_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveItemOf(IfcClassification ItemOf)
	{
		if(ItemOf != null)
		{
				if(ItemOf.Contains_Inverse != null)
				{
					ItemOf.Contains_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the Title attribute to the given value.
	*
	* @param Title OPTIONAL value to set
	**/
	public void setTitle(IfcLabel Title)
	{
		this.Title = Title;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Title attribute.
	*
	* @return the value of Title
	/**/
	public IfcLabel getTitle()
	{
		return this.Title;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepParameter(java.util.ArrayList<CloneableObject> parameter)
	{
		this.stepParameter = parameter;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	java.util.ArrayList<CloneableObject> getStepParameter()
	{
		return this.stepParameter;
	}

	/**
	 * This method registers an ObjectChangeListener to this object. An event is fired whenever one of its values was changed.
	 * 
	 *@param listener the listener to register
	**/
	public void addObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	listenerList = new java.util.HashSet<ObjectChangeListener>(1,1);
		listenerList.add(listener);
	}

	/**
	 * This method unregisters an ObjectChangeListener from this object.
	 * 
	 *@param listener the listener to unregister
	**/
	public void removeObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	return;
		listenerList.remove(listener);
		if (listenerList.size()==0) listenerList = null;
	}

	/**
	 * This method removes all currently registered ObjectChangeListeners from this object.
	**/
	public void removeAllObjectChangeListeners()
	{
		listenerList = null;
	}

	protected void fireChangeEvent()
	{
		if(listenerList == null) return;
		for(ObjectChangeListener listener : listenerList)
			listener.ifcModelObjectChange(this);
	}

	/**
	 * This method clones the object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{
		IfcClassificationItem ifcClassificationItem = new IfcClassificationItem();
		if(this.Notation != null)
			ifcClassificationItem.setNotation((IfcClassificationNotationFacet)this.Notation.clone());
		if(this.ItemOf != null)
			ifcClassificationItem.setItemOf((IfcClassification)this.ItemOf.clone());
		if(this.Title != null)
			ifcClassificationItem.setTitle((IfcLabel)this.Title.clone());
		return ifcClassificationItem;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcClassificationItem ifcClassificationItem = new IfcClassificationItem();
		if(this.Notation != null)
			ifcClassificationItem.setNotation(this.Notation);
		if(this.ItemOf != null)
			ifcClassificationItem.setItemOf(this.ItemOf);
		if(this.Title != null)
			ifcClassificationItem.setTitle(this.Title);
		return ifcClassificationItem;
	}

	/**
	* This method returns the objects standard description.
	*
	* @return the standard description
	**/
	public String toString()
	{
		return "#"+ this.getStepLineNumber() + " " + this.getClass().getSimpleName();
	}


}
