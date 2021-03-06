/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcAnnotationSurface<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcAnnotationSurface extends IfcGeometricRepresentationItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGeometricRepresentationItem","IfcTextureCoordinate"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Item is an DEMANDED attribute - may not be null**/
	protected IfcGeometricRepresentationItem Item;
	/** TextureCoordinates is an OPTIONAL attribute**/
	protected IfcTextureCoordinate TextureCoordinates;
	/**
	* The default constructor.
	**/
	public IfcAnnotationSurface(){}

	private static final String[] attributes = new String[]{"Item","TextureCoordinates"};

	public String[] getAttributes() {
		return IfcAnnotationSurface.attributes;
	}
	/**
	* Constructs a new IfcAnnotationSurface object using the given parameters.
	*
	* @param Item DEMANDED parameter of type IfcGeometricRepresentationItem - may not be null.
	* @param TextureCoordinates OPTIONAL parameter of type IfcTextureCoordinate
	**/
	public IfcAnnotationSurface(IfcGeometricRepresentationItem Item, IfcTextureCoordinate TextureCoordinates)
	{
		this.Item = Item;
		this.TextureCoordinates = TextureCoordinates;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcAnnotationSurface object using the given parameters.
	*
	* @param Item DEMANDED parameter of type IfcGeometricRepresentationItem - may not be null.
	* @param TextureCoordinates OPTIONAL parameter of type IfcTextureCoordinate
	**/
	public void setParameters(IfcGeometricRepresentationItem Item, IfcTextureCoordinate TextureCoordinates)
	{
		this.Item = Item;
		this.TextureCoordinates = TextureCoordinates;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Item = (IfcGeometricRepresentationItem) parameters.get(0);
		this.TextureCoordinates = (IfcTextureCoordinate) parameters.get(1);
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
		if(TextureCoordinates != null)
		{
				if(TextureCoordinates.AnnotatedSurface_Inverse == null)
				{
					TextureCoordinates.AnnotatedSurface_Inverse = new SET<IfcAnnotationSurface>();
				}
				TextureCoordinates.AnnotatedSurface_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcAnnotationSurface.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCANNOTATIONSURFACE(");
		if(getRedefinedDerivedAttributeTypes().contains("Item")) stepString = stepString.concat("*,");
		else{
		if(this.Item != null)		stepString = stepString.concat(((RootInterface)this.Item).getStepParameter(IfcGeometricRepresentationItem.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TextureCoordinates")) stepString = stepString.concat("*);");
		else{
		if(this.TextureCoordinates != null)		stepString = stepString.concat(((RootInterface)this.TextureCoordinates).getStepParameter(IfcTextureCoordinate.class.isInterface())+");");
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
	* This method sets the Item attribute to the given value.
	*
	* @param Item OPTIONAL value to set
	**/
	public void setItem(IfcGeometricRepresentationItem Item)
	{
		this.Item = Item;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Item attribute.
	*
	* @return the value of Item
	/**/
	public IfcGeometricRepresentationItem getItem()
	{
		return this.Item;
	}

	/**
	* This method sets the TextureCoordinates attribute to the given value.
	*
	* @param TextureCoordinates DEMANDED value to set - may not be null
	**/
	public void setTextureCoordinates(IfcTextureCoordinate TextureCoordinates)
	{
		synchronizeInversesRemoveTextureCoordinates(this.TextureCoordinates);
		this.TextureCoordinates = TextureCoordinates;
		synchronizeInversesAddTextureCoordinates(this.TextureCoordinates);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TextureCoordinates attribute.
	*
	* @return the value of TextureCoordinates
	/**/
	public IfcTextureCoordinate getTextureCoordinates()
	{
		return this.TextureCoordinates;
	}

	private void synchronizeInversesAddTextureCoordinates(IfcTextureCoordinate TextureCoordinates)
	{
		if(TextureCoordinates != null)
		{
				if(TextureCoordinates.AnnotatedSurface_Inverse == null)
				{
					TextureCoordinates.AnnotatedSurface_Inverse = new SET<IfcAnnotationSurface>();
				}
				TextureCoordinates.AnnotatedSurface_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveTextureCoordinates(IfcTextureCoordinate TextureCoordinates)
	{
		if(TextureCoordinates != null)
		{
				if(TextureCoordinates.AnnotatedSurface_Inverse != null)
				{
					TextureCoordinates.AnnotatedSurface_Inverse.remove(this);
				}
		}
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
		IfcAnnotationSurface ifcAnnotationSurface = new IfcAnnotationSurface();
		if(this.Item != null)
			ifcAnnotationSurface.setItem((IfcGeometricRepresentationItem)this.Item.clone());
		if(this.TextureCoordinates != null)
			ifcAnnotationSurface.setTextureCoordinates((IfcTextureCoordinate)this.TextureCoordinates.clone());
		return ifcAnnotationSurface;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcAnnotationSurface ifcAnnotationSurface = new IfcAnnotationSurface();
		if(this.Item != null)
			ifcAnnotationSurface.setItem(this.Item);
		if(this.TextureCoordinates != null)
			ifcAnnotationSurface.setTextureCoordinates(this.TextureCoordinates);
		return ifcAnnotationSurface;
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
