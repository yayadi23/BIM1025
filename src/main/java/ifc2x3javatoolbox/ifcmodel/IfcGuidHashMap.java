package ifc2x3javatoolbox.ifcmodel;
import ifc2x3javatoolbox.ifc2x3tc1.ClassInterface;
import ifc2x3javatoolbox.ifc2x3tc1.IfcRoot;
import java.util.Collection;
import java.util.HashMap;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcGuidHashMap extends HashMap<String, ClassInterface> implements IfcModelListener
{

	private static final long serialVersionUID = 1L;

	public IfcGuidHashMap(IfcModel ifcModel)
	{
		this(ifcModel, true);
	}
	
	public IfcGuidHashMap(IfcModel ifcModel, boolean listenToModel)
	{
		if(listenToModel)
			ifcModel.addIfcModelListener(this);
		modelObjectsAdded(ifcModel.getIfcObjects());
	}
	
	
	@Override
	public void modelObjectAdded(ClassInterface ifcObject) {
		if (ifcObject instanceof IfcRoot) this.put(
				((IfcRoot) ifcObject).getGlobalId().getDecodedValue(),
				ifcObject);
	}

	@Override
	public void modelObjectRemoved(ClassInterface object) {
		if (object instanceof IfcRoot) this.put(
		((IfcRoot) object).getGlobalId().getDecodedValue(),
		object);
	}

	@Override
	public void modelObjectsAdded(Collection<ClassInterface> objects) 
	{
		for(ClassInterface ifcObject : objects)
		{
			if (ifcObject instanceof IfcRoot) this.put(
					((IfcRoot) ifcObject).getGlobalId().getDecodedValue(),
					ifcObject);
		}
		
	}

	@Override
	public void modelObjectsRemoved(Collection<ClassInterface> objects) {
		for(ClassInterface ifcObject : objects)
		{
			if (ifcObject instanceof IfcRoot) this
			.remove(((IfcRoot) ifcObject).getGlobalId()
					.getDecodedValue());
		}
		
	}

	@Override
	public void modelContentChanged() {
		this.clear();
	}


	/**
	 * This method returns a map of IFC objects to the corresponding GUIDs. The
	 * key is represented by the IFC objects GUID as String.
	 * @param globalUniqueIDs
	 *            the GUIDs
	 * @return the corresponding objects as HasMap, where the key is the objects
	 *         GUID
	 */
	public HashMap<String, ClassInterface> getIfcObjectsByIDs(
			Collection<String> globalUniqueIDs)
	{
		HashMap<String, ClassInterface> ifcObjects = new HashMap<String, ClassInterface>(globalUniqueIDs.size(),1);
		for (String id : globalUniqueIDs) {
			ClassInterface ifcObject = getIfcObjectByID(id);
			if (ifcObject != null) ifcObjects.put(((IfcRoot) ifcObject)
					.getGlobalId().getDecodedValue(), ifcObject);
		}
		return ifcObjects;
	}

	/**
	 * This method returns an IFC object to the corresponding GUID
	 * @param globalUniqueID
	 *            the GUID
	 * @return the corresponding object
	 */
	public ClassInterface getIfcObjectByID(String globalUniqueID) {
		return this.get(globalUniqueID);
	}
	

}
