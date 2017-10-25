/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcEllipseProfileDef<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcEllipseProfileDef extends IfcParameterizedProfileDef implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileTypeEnum","IfcLabel","IfcAxis2Placement2D","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** SemiAxis1 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure SemiAxis1;
	/** SemiAxis2 is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure SemiAxis2;
	/**
	* The default constructor.
	**/
	public IfcEllipseProfileDef(){}

	private static final String[] attributes = new String[]{"ProfileType","ProfileName","Position","SemiAxis1","SemiAxis2"};

	public String[] getAttributes() {
		return IfcEllipseProfileDef.attributes;
	}

	/**
	* Constructs a new IfcEllipseProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position DEMANDED parameter of type IfcAxis2Placement2D - may not be null.
	* @param SemiAxis1 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param SemiAxis2 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public IfcEllipseProfileDef(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure SemiAxis1, IfcPositiveLengthMeasure SemiAxis2)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.SemiAxis1 = SemiAxis1;
		this.SemiAxis2 = SemiAxis2;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcEllipseProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position DEMANDED parameter of type IfcAxis2Placement2D - may not be null.
	* @param SemiAxis1 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param SemiAxis2 DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public void setParameters(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure SemiAxis1, IfcPositiveLengthMeasure SemiAxis2)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.SemiAxis1 = SemiAxis1;
		this.SemiAxis2 = SemiAxis2;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ProfileType = (IfcProfileTypeEnum) parameters.get(0);
		this.ProfileName = (IfcLabel) parameters.get(1);
		this.Position = (IfcAxis2Placement2D) parameters.get(2);
		this.SemiAxis1 = (IfcPositiveLengthMeasure) parameters.get(3);
		this.SemiAxis2 = (IfcPositiveLengthMeasure) parameters.get(4);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcEllipseProfileDef.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCELLIPSEPROFILEDEF(");
		if(getRedefinedDerivedAttributeTypes().contains("ProfileType")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileType != null)		stepString = stepString.concat(((RootInterface)this.ProfileType).getStepParameter(IfcProfileTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProfileName")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileName != null)		stepString = stepString.concat(((RootInterface)this.ProfileName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*,");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement2D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SemiAxis1")) stepString = stepString.concat("*,");
		else{
		if(this.SemiAxis1 != null)		stepString = stepString.concat(((RootInterface)this.SemiAxis1).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SemiAxis2")) stepString = stepString.concat("*);");
		else{
		if(this.SemiAxis2 != null)		stepString = stepString.concat(((RootInterface)this.SemiAxis2).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
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
	* This method sets the SemiAxis1 attribute to the given value.
	*
	* @param SemiAxis1 OPTIONAL value to set
	**/
	public void setSemiAxis1(IfcPositiveLengthMeasure SemiAxis1)
	{
		this.SemiAxis1 = SemiAxis1;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SemiAxis1 attribute.
	*
	* @return the value of SemiAxis1
	/**/
	public IfcPositiveLengthMeasure getSemiAxis1()
	{
		return this.SemiAxis1;
	}

	/**
	* This method sets the SemiAxis2 attribute to the given value.
	*
	* @param SemiAxis2 OPTIONAL value to set
	**/
	public void setSemiAxis2(IfcPositiveLengthMeasure SemiAxis2)
	{
		this.SemiAxis2 = SemiAxis2;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the SemiAxis2 attribute.
	*
	* @return the value of SemiAxis2
	/**/
	public IfcPositiveLengthMeasure getSemiAxis2()
	{
		return this.SemiAxis2;
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
		IfcEllipseProfileDef ifcEllipseProfileDef = new IfcEllipseProfileDef();
		if(this.ProfileType != null)
			ifcEllipseProfileDef.setProfileType((IfcProfileTypeEnum)this.ProfileType.clone());
		if(this.ProfileName != null)
			ifcEllipseProfileDef.setProfileName((IfcLabel)this.ProfileName.clone());
		if(this.Position != null)
			ifcEllipseProfileDef.setPosition((IfcAxis2Placement2D)this.Position.clone());
		if(this.SemiAxis1 != null)
			ifcEllipseProfileDef.setSemiAxis1((IfcPositiveLengthMeasure)this.SemiAxis1.clone());
		if(this.SemiAxis2 != null)
			ifcEllipseProfileDef.setSemiAxis2((IfcPositiveLengthMeasure)this.SemiAxis2.clone());
		return ifcEllipseProfileDef;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcEllipseProfileDef ifcEllipseProfileDef = new IfcEllipseProfileDef();
		if(this.ProfileType != null)
			ifcEllipseProfileDef.setProfileType(this.ProfileType);
		if(this.ProfileName != null)
			ifcEllipseProfileDef.setProfileName(this.ProfileName);
		if(this.Position != null)
			ifcEllipseProfileDef.setPosition(this.Position);
		if(this.SemiAxis1 != null)
			ifcEllipseProfileDef.setSemiAxis1(this.SemiAxis1);
		if(this.SemiAxis2 != null)
			ifcEllipseProfileDef.setSemiAxis2(this.SemiAxis2);
		return ifcEllipseProfileDef;
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