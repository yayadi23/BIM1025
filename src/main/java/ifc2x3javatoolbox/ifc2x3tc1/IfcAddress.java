/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcAddress<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public abstract class IfcAddress extends InternalAccessClass implements IfcObjectReferenceSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcAddressTypeEnum","IfcText","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Purpose is an OPTIONAL attribute**/
	protected IfcAddressTypeEnum Purpose;
	/** Description is an OPTIONAL attribute**/
	protected IfcText Description;
	/** UserDefinedPurpose is an OPTIONAL attribute**/
	protected IfcLabel UserDefinedPurpose;
	protected SET<IfcPerson> OfPerson_Inverse;
	protected SET<IfcOrganization> OfOrganization_Inverse;

	private static final String[] attributes = new String[]{"Purpose","Description","UserDefinedPurpose"};

	public String[] getAttributes() {
		return IfcAddress.attributes;
	}

	/**
	* The default constructor.
	**/
	public IfcAddress(){}

	/**
	* Constructs a new IfcAddress object using the given parameters.
	*
	* @param Purpose OPTIONAL parameter of type IfcAddressTypeEnum
	* @param Description OPTIONAL parameter of type IfcText
	* @param UserDefinedPurpose OPTIONAL parameter of type IfcLabel
	**/
	public IfcAddress(IfcAddressTypeEnum Purpose, IfcText Description, IfcLabel UserDefinedPurpose)
	{
		this.Purpose = Purpose;
		this.Description = Description;
		this.UserDefinedPurpose = UserDefinedPurpose;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcAddress object using the given parameters.
	*
	* @param Purpose OPTIONAL parameter of type IfcAddressTypeEnum
	* @param Description OPTIONAL parameter of type IfcText
	* @param UserDefinedPurpose OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcAddressTypeEnum Purpose, IfcText Description, IfcLabel UserDefinedPurpose)
	{
		this.Purpose = Purpose;
		this.Description = Description;
		this.UserDefinedPurpose = UserDefinedPurpose;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Purpose = (IfcAddressTypeEnum) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.UserDefinedPurpose = (IfcLabel) parameters.get(2);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
		OfPerson_Inverse = null;
		OfOrganization_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcAddress.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCADDRESS(");
		if(getRedefinedDerivedAttributeTypes().contains("Purpose")) stepString = stepString.concat("*,");
		else{
		if(this.Purpose != null)		stepString = stepString.concat(((RootInterface)this.Purpose).getStepParameter(IfcAddressTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedPurpose")) stepString = stepString.concat("*);");
		else{
		if(this.UserDefinedPurpose != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedPurpose).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method returns a copy of the set of the OfPerson_Inverse attribute.
	*
	* @return a copy of the OfPerson_Inverse set
	**/
	public SET<IfcPerson> getOfPerson_Inverse()
	{
		if(this.OfPerson_Inverse != null)
			return new SET<IfcPerson>(this.OfPerson_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the OfOrganization_Inverse attribute.
	*
	* @return a copy of the OfOrganization_Inverse set
	**/
	public SET<IfcOrganization> getOfOrganization_Inverse()
	{
		if(this.OfOrganization_Inverse != null)
			return new SET<IfcOrganization>(this.OfOrganization_Inverse);
		return null;
	}

	/**
	* This method sets the Purpose attribute to the given value.
	*
	* @param Purpose DEMANDED value to set - may not be null
	**/
	public void setPurpose(IfcAddressTypeEnum Purpose)
	{
		this.Purpose = Purpose;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Purpose attribute.
	*
	* @return the value of Purpose
	/**/
	public IfcAddressTypeEnum getPurpose()
	{
		return this.Purpose;
	}

	/**
	* This method sets the Description attribute to the given value.
	*
	* @param Description DEMANDED value to set - may not be null
	**/
	public void setDescription(IfcText Description)
	{
		this.Description = Description;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Description attribute.
	*
	* @return the value of Description
	/**/
	public IfcText getDescription()
	{
		return this.Description;
	}

	/**
	* This method sets the UserDefinedPurpose attribute to the given value.
	*
	* @param UserDefinedPurpose DEMANDED value to set - may not be null
	**/
	public void setUserDefinedPurpose(IfcLabel UserDefinedPurpose)
	{
		this.UserDefinedPurpose = UserDefinedPurpose;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the UserDefinedPurpose attribute.
	*
	* @return the value of UserDefinedPurpose
	/**/
	public IfcLabel getUserDefinedPurpose()
	{
		return this.UserDefinedPurpose;
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
	public abstract Object clone();

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public abstract Object shallowCopy();

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
