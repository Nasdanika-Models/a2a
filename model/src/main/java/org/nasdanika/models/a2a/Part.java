/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "anyOf": [
 *     {"$ref": "#/$defs/TextPart"},
 *     {"$ref": "#/$defs/FilePart"},
 *     {"$ref": "#/$defs/DataPart"}
 *   ],
 *   "title": "Part"
 * }
 * ```
 * 
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getPart()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface Part extends EObject {
} // Part
