/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcTextStyleWithBoxCharacteristics<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTextStyleWithBoxCharacteristics extends InternalAccessClass implements IfcTextStyleSelect, ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPlaneAngleMeasure","IfcPlaneAngleMeasure","IfcSizeSelect"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** BoxHeight is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure BoxHeight;
	/** BoxWidth is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure BoxWidth;
	/** BoxSlantAngle is an OPTIONAL attribute**/
	protected IfcPlaneAngleMeasure BoxSlantAngle;
	/** BoxRotateAngle is an OPTIONAL attribute**/
	protected IfcPlaneAngleMeasure BoxRotateAngle;
	/** CharacterSpacing is an OPTIONAL attribute**/
	protected IfcSizeSelect CharacterSpacing;
	/**
	* The default constructor.
	**/
	public IfcTextStyleWithBoxCharacteristics(){}

	private static final String[] attributes = new String[]{"BoxHeight","BoxWidth","BoxSlantAngle","BoxRotateAngle","CharacterSpacing"};

	public String[] getAttributes(){
		return IfcTextStyleWithBoxCharacteristics.attributes;
	}

	/**
	* Constructs a new IfcTextStyleWithBoxCharacteristics object using the given parameters.
	*
	* @param BoxHeight OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param BoxWidth OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param BoxSlantAngle OPTIONAL parameter of type IfcPlaneAngleMeasure
	* @param BoxRotateAngle OPTIONAL parameter of type IfcPlaneAngleMeasure
	* @param CharacterSpacing OPTIONAL parameter of type IfcSizeSelect
	**/
	public IfcTextStyleWithBoxCharacteristics(IfcPositiveLengthMeasure BoxHeight, IfcPositiveLengthMeasure BoxWidth, IfcPlaneAngleMeasure BoxSlantAngle, IfcPlaneAngleMeasure BoxRotateAngle, IfcSizeSelect CharacterSpacing)
	{
		this.BoxHeight = BoxHeight;
		this.BoxWidth = BoxWidth;
		this.BoxSlantAngle = BoxSlantAngle;
		this.BoxRotateAngle = BoxRotateAngle;
		this.CharacterSpacing = CharacterSpacing;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTextStyleWithBoxCharacteristics object using the given parameters.
	*
	* @param BoxHeight OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param BoxWidth OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param BoxSlantAngle OPTIONAL parameter of type IfcPlaneAngleMeasure
	* @param BoxRotateAngle OPTIONAL parameter of type IfcPlaneAngleMeasure
	* @param CharacterSpacing OPTIONAL parameter of type IfcSizeSelect
	**/
	public void setParameters(IfcPositiveLengthMeasure BoxHeight, IfcPositiveLengthMeasure BoxWidth, IfcPlaneAngleMeasure BoxSlantAngle, IfcPlaneAngleMeasure BoxRotateAngle, IfcSizeSelect CharacterSpacing)
	{
		this.BoxHeight = BoxHeight;
		this.BoxWidth = BoxWidth;
		this.BoxSlantAngle = BoxSlantAngle;
		this.BoxRotateAngle = BoxRotateAngle;
		this.CharacterSpacing = CharacterSpacing;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.BoxHeight = (IfcPositiveLengthMeasure) parameters.get(0);
		this.BoxWidth = (IfcPositiveLengthMeasure) parameters.get(1);
		this.BoxSlantAngle = (IfcPlaneAngleMeasure) parameters.get(2);
		this.BoxRotateAngle = (IfcPlaneAngleMeasure) parameters.get(3);
		this.CharacterSpacing = (IfcSizeSelect) parameters.get(4);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
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
		return IfcTextStyleWithBoxCharacteristics.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTEXTSTYLEWITHBOXCHARACTERISTICS(");
		if(getRedefinedDerivedAttributeTypes().contains("BoxHeight")) stepString = stepString.concat("*,");
		else{
		if(this.BoxHeight != null)		stepString = stepString.concat(((RootInterface)this.BoxHeight).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BoxWidth")) stepString = stepString.concat("*,");
		else{
		if(this.BoxWidth != null)		stepString = stepString.concat(((RootInterface)this.BoxWidth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BoxSlantAngle")) stepString = stepString.concat("*,");
		else{
		if(this.BoxSlantAngle != null)		stepString = stepString.concat(((RootInterface)this.BoxSlantAngle).getStepParameter(IfcPlaneAngleMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("BoxRotateAngle")) stepString = stepString.concat("*,");
		else{
		if(this.BoxRotateAngle != null)		stepString = stepString.concat(((RootInterface)this.BoxRotateAngle).getStepParameter(IfcPlaneAngleMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CharacterSpacing")) stepString = stepString.concat("*);");
		else{
		if(this.CharacterSpacing != null)		stepString = stepString.concat(((RootInterface)this.CharacterSpacing).getStepParameter(IfcSizeSelect.class.isInterface())+");");
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
	* This method sets the BoxHeight attribute to the given value.
	*
	* @param BoxHeight DEMANDED value to set - may not be null
	**/
	public void setBoxHeight(IfcPositiveLengthMeasure BoxHeight)
	{
		this.BoxHeight = BoxHeight;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BoxHeight attribute.
	*
	* @return the value of BoxHeight
	/**/
	public IfcPositiveLengthMeasure getBoxHeight()
	{
		return this.BoxHeight;
	}

	/**
	* This method sets the BoxWidth attribute to the given value.
	*
	* @param BoxWidth DEMANDED value to set - may not be null
	**/
	public void setBoxWidth(IfcPositiveLengthMeasure BoxWidth)
	{
		this.BoxWidth = BoxWidth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BoxWidth attribute.
	*
	* @return the value of BoxWidth
	/**/
	public IfcPositiveLengthMeasure getBoxWidth()
	{
		return this.BoxWidth;
	}

	/**
	* This method sets the BoxSlantAngle attribute to the given value.
	*
	* @param BoxSlantAngle DEMANDED value to set - may not be null
	**/
	public void setBoxSlantAngle(IfcPlaneAngleMeasure BoxSlantAngle)
	{
		this.BoxSlantAngle = BoxSlantAngle;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BoxSlantAngle attribute.
	*
	* @return the value of BoxSlantAngle
	/**/
	public IfcPlaneAngleMeasure getBoxSlantAngle()
	{
		return this.BoxSlantAngle;
	}

	/**
	* This method sets the BoxRotateAngle attribute to the given value.
	*
	* @param BoxRotateAngle DEMANDED value to set - may not be null
	**/
	public void setBoxRotateAngle(IfcPlaneAngleMeasure BoxRotateAngle)
	{
		this.BoxRotateAngle = BoxRotateAngle;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BoxRotateAngle attribute.
	*
	* @return the value of BoxRotateAngle
	/**/
	public IfcPlaneAngleMeasure getBoxRotateAngle()
	{
		return this.BoxRotateAngle;
	}

	/**
	* This method sets the CharacterSpacing attribute to the given value.
	*
	* @param CharacterSpacing DEMANDED value to set - may not be null
	**/
	public void setCharacterSpacing(IfcSizeSelect CharacterSpacing)
	{
		this.CharacterSpacing = CharacterSpacing;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the CharacterSpacing attribute.
	*
	* @return the value of CharacterSpacing
	/**/
	public IfcSizeSelect getCharacterSpacing()
	{
		return this.CharacterSpacing;
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
		IfcTextStyleWithBoxCharacteristics ifcTextStyleWithBoxCharacteristics = new IfcTextStyleWithBoxCharacteristics();
		if(this.BoxHeight != null)
			ifcTextStyleWithBoxCharacteristics.setBoxHeight((IfcPositiveLengthMeasure)this.BoxHeight.clone());
		if(this.BoxWidth != null)
			ifcTextStyleWithBoxCharacteristics.setBoxWidth((IfcPositiveLengthMeasure)this.BoxWidth.clone());
		if(this.BoxSlantAngle != null)
			ifcTextStyleWithBoxCharacteristics.setBoxSlantAngle((IfcPlaneAngleMeasure)this.BoxSlantAngle.clone());
		if(this.BoxRotateAngle != null)
			ifcTextStyleWithBoxCharacteristics.setBoxRotateAngle((IfcPlaneAngleMeasure)this.BoxRotateAngle.clone());
		if(this.CharacterSpacing != null)
			ifcTextStyleWithBoxCharacteristics.setCharacterSpacing((IfcSizeSelect)this.CharacterSpacing.clone());
		return ifcTextStyleWithBoxCharacteristics;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTextStyleWithBoxCharacteristics ifcTextStyleWithBoxCharacteristics = new IfcTextStyleWithBoxCharacteristics();
		if(this.BoxHeight != null)
			ifcTextStyleWithBoxCharacteristics.setBoxHeight(this.BoxHeight);
		if(this.BoxWidth != null)
			ifcTextStyleWithBoxCharacteristics.setBoxWidth(this.BoxWidth);
		if(this.BoxSlantAngle != null)
			ifcTextStyleWithBoxCharacteristics.setBoxSlantAngle(this.BoxSlantAngle);
		if(this.BoxRotateAngle != null)
			ifcTextStyleWithBoxCharacteristics.setBoxRotateAngle(this.BoxRotateAngle);
		if(this.CharacterSpacing != null)
			ifcTextStyleWithBoxCharacteristics.setCharacterSpacing(this.CharacterSpacing);
		return ifcTextStyleWithBoxCharacteristics;
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
