/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcDocumentReference<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcDocumentReference extends IfcExternalReference implements ClassInterface, IfcDocumentSelect
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcIdentifier","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	protected SET<IfcDocumentInformation> ReferenceToDocument_Inverse;
	/**
	* The default constructor.
	**/
	public IfcDocumentReference(){}

	private static final String[] attributes = new String[]{"Location","ItemReference","Name"};

	public String[] getAttributes() {
		return IfcDocumentReference.attributes;
	}

	/**
	* Constructs a new IfcDocumentReference object using the given parameters.
	*
	* @param Location OPTIONAL parameter of type IfcLabel
	* @param ItemReference OPTIONAL parameter of type IfcIdentifier
	* @param Name OPTIONAL parameter of type IfcLabel
	**/
	public IfcDocumentReference(IfcLabel Location, IfcIdentifier ItemReference, IfcLabel Name)
	{
		this.Location = Location;
		this.ItemReference = ItemReference;
		this.Name = Name;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Location = (IfcLabel) parameters.get(0);
		this.ItemReference = (IfcIdentifier) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		ReferenceToDocument_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcDocumentReference.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCDOCUMENTREFERENCE(");
		if(getRedefinedDerivedAttributeTypes().contains("Location")) stepString = stepString.concat("*,");
		else{
		if(this.Location != null)		stepString = stepString.concat(((RootInterface)this.Location).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ItemReference")) stepString = stepString.concat("*,");
		else{
		if(this.ItemReference != null)		stepString = stepString.concat(((RootInterface)this.ItemReference).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*);");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method returns a copy of the set of the ReferenceToDocument_Inverse attribute.
	*
	* @return a copy of the ReferenceToDocument_Inverse set
	**/
	public SET<IfcDocumentInformation> getReferenceToDocument_Inverse()
	{
		if(this.ReferenceToDocument_Inverse != null)
			return new SET<IfcDocumentInformation>(this.ReferenceToDocument_Inverse);
		return null;
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
		IfcDocumentReference ifcDocumentReference = new IfcDocumentReference();
		if(this.Location != null)
			ifcDocumentReference.setLocation((IfcLabel)this.Location.clone());
		if(this.ItemReference != null)
			ifcDocumentReference.setItemReference((IfcIdentifier)this.ItemReference.clone());
		if(this.Name != null)
			ifcDocumentReference.setName((IfcLabel)this.Name.clone());
		return ifcDocumentReference;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcDocumentReference ifcDocumentReference = new IfcDocumentReference();
		if(this.Location != null)
			ifcDocumentReference.setLocation(this.Location);
		if(this.ItemReference != null)
			ifcDocumentReference.setItemReference(this.ItemReference);
		if(this.Name != null)
			ifcDocumentReference.setName(this.Name);
		return ifcDocumentReference;
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
