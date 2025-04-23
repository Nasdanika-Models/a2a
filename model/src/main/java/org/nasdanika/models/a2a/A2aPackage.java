/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * TODO...
 * 
 * 
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.a2a.A2aFactory
 * @model kind="package"
 * @generated
 */
public interface A2aPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "a2a";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/a2a";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.a2a";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A2aPackage eINSTANCE = org.nasdanika.models.a2a.impl.A2aPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 1;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SESSION_ID = 2;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HISTORY = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ARTIFACTS = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.UnsupportedOperationErrorImpl <em>Unsupported Operation Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.UnsupportedOperationErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getUnsupportedOperationError()
	 * @generated
	 */
	int UNSUPPORTED_OPERATION_ERROR = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORTED_OPERATION_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORTED_OPERATION_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORTED_OPERATION_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Unsupported Operation Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORTED_OPERATION_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unsupported Operation Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSUPPORTED_OPERATION_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.JSONRPCRequestImpl <em>JSONRPC Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.JSONRPCRequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONRPCRequest()
	 * @generated
	 */
	int JSONRPC_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_REQUEST__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_REQUEST__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_REQUEST__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_REQUEST__PARAMS = 3;

	/**
	 * The number of structural features of the '<em>JSONRPC Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>JSONRPC Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.SendTaskStreamingResponseResultImpl <em>Send Task Streaming Response Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.SendTaskStreamingResponseResultImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskStreamingResponseResult()
	 * @generated
	 */
	int SEND_TASK_STREAMING_RESPONSE_RESULT = 5;

	/**
	 * The number of structural features of the '<em>Send Task Streaming Response Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Send Task Streaming Response Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_RESPONSE_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskStatusUpdateEventImpl <em>Task Status Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskStatusUpdateEventImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskStatusUpdateEvent()
	 * @generated
	 */
	int TASK_STATUS_UPDATE_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS_UPDATE_EVENT__METADATA = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS_UPDATE_EVENT__FINAL = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS_UPDATE_EVENT__ID = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS_UPDATE_EVENT__STATUS = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Status Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS_UPDATE_EVENT_FEATURE_COUNT = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task Status Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS_UPDATE_EVENT_OPERATION_COUNT = SEND_TASK_STREAMING_RESPONSE_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.AuthenticationInfoImpl <em>Authentication Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.AuthenticationInfoImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAuthenticationInfo()
	 * @generated
	 */
	int AUTHENTICATION_INFO = 4;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_INFO__CREDENTIALS = 0;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_INFO__SCHEMES = 1;

	/**
	 * The number of structural features of the '<em>Authentication Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Authentication Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.SendTaskStreamingResponseImpl <em>Send Task Streaming Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.SendTaskStreamingResponseImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskStreamingResponse()
	 * @generated
	 */
	int SEND_TASK_STREAMING_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_RESPONSE__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_RESPONSE__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_RESPONSE__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_RESPONSE__ERROR = 3;

	/**
	 * The number of structural features of the '<em>Send Task Streaming Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Send Task Streaming Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskPushNotificationConfigImpl <em>Task Push Notification Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskPushNotificationConfigImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskPushNotificationConfig()
	 * @generated
	 */
	int TASK_PUSH_NOTIFICATION_CONFIG = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PUSH_NOTIFICATION_CONFIG__ID = 0;

	/**
	 * The feature id for the '<em><b>Push Notification Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG = 1;

	/**
	 * The number of structural features of the '<em>Task Push Notification Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PUSH_NOTIFICATION_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Push Notification Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PUSH_NOTIFICATION_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.AgentCardImpl <em>Agent Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.AgentCardImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentCard()
	 * @generated
	 */
	int AGENT_CARD = 8;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__SKILLS = 0;

	/**
	 * The feature id for the '<em><b>Documentation Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__DOCUMENTATION_URL = 1;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__CAPABILITIES = 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Default Output Modes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__DEFAULT_OUTPUT_MODES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__NAME = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__VERSION = 7;

	/**
	 * The feature id for the '<em><b>Default Input Modes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__DEFAULT_INPUT_MODES = 8;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__URL = 9;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD__AUTHENTICATION = 10;

	/**
	 * The number of structural features of the '<em>Agent Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Agent Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.AgentCapabilitiesImpl <em>Agent Capabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.AgentCapabilitiesImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentCapabilities()
	 * @generated
	 */
	int AGENT_CAPABILITIES = 9;

	/**
	 * The feature id for the '<em><b>Streaming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CAPABILITIES__STREAMING = 0;

	/**
	 * The feature id for the '<em><b>Push Notifications</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CAPABILITIES__PUSH_NOTIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>State Transition History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY = 2;

	/**
	 * The number of structural features of the '<em>Agent Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CAPABILITIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Agent Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CAPABILITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.A2ARequestImpl <em>A2A Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.A2ARequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getA2ARequest()
	 * @generated
	 */
	int A2A_REQUEST = 14;

	/**
	 * The number of structural features of the '<em>A2A Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2A_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>A2A Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2A_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.SendTaskRequestImpl <em>Send Task Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.SendTaskRequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskRequest()
	 * @generated
	 */
	int SEND_TASK_REQUEST = 10;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_REQUEST__METHOD = A2A_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_REQUEST__ID = A2A_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_REQUEST__JSONRPC = A2A_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_REQUEST__PARAMS = A2A_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Send Task Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_REQUEST_FEATURE_COUNT = A2A_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Send Task Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_REQUEST_OPERATION_COUNT = A2A_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.JSONParseErrorImpl <em>JSON Parse Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.JSONParseErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONParseError()
	 * @generated
	 */
	int JSON_PARSE_ERROR = 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PARSE_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PARSE_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PARSE_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>JSON Parse Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PARSE_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>JSON Parse Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PARSE_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.PartImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getPart()
	 * @generated
	 */
	int PART = 20;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.DataPartImpl <em>Data Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.DataPartImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getDataPart()
	 * @generated
	 */
	int DATA_PART = 12;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PART__METADATA = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PART__DATA = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PART__TYPE = PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PART_FEATURE_COUNT = PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PART_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.InvalidRequestErrorImpl <em>Invalid Request Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.InvalidRequestErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getInvalidRequestError()
	 * @generated
	 */
	int INVALID_REQUEST_ERROR = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_REQUEST_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_REQUEST_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_REQUEST_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Invalid Request Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_REQUEST_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Invalid Request Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_REQUEST_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskNotFoundErrorImpl <em>Task Not Found Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskNotFoundErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskNotFoundError()
	 * @generated
	 */
	int TASK_NOT_FOUND_ERROR = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_FOUND_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_FOUND_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_FOUND_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Task Not Found Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_FOUND_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Not Found Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_FOUND_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.JSONRPCResponseImpl <em>JSONRPC Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.JSONRPCResponseImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONRPCResponse()
	 * @generated
	 */
	int JSONRPC_RESPONSE = 16;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_RESPONSE__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_RESPONSE__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_RESPONSE__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_RESPONSE__ERROR = 3;

	/**
	 * The number of structural features of the '<em>JSONRPC Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>JSONRPC Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.FilePartImpl <em>File Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.FilePartImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getFilePart()
	 * @generated
	 */
	int FILE_PART = 17;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PART__METADATA = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PART__FILE = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PART__TYPE = PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PART_FEATURE_COUNT = PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>File Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PART_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskQueryParamsImpl <em>Task Query Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskQueryParamsImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskQueryParams()
	 * @generated
	 */
	int TASK_QUERY_PARAMS = 18;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_QUERY_PARAMS__METADATA = 0;

	/**
	 * The feature id for the '<em><b>History Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_QUERY_PARAMS__HISTORY_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_QUERY_PARAMS__ID = 2;

	/**
	 * The number of structural features of the '<em>Task Query Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_QUERY_PARAMS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Query Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_QUERY_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.PushNotificationConfigImpl <em>Push Notification Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.PushNotificationConfigImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getPushNotificationConfig()
	 * @generated
	 */
	int PUSH_NOTIFICATION_CONFIG = 19;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_CONFIG__URL = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_CONFIG__TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_CONFIG__AUTHENTICATION = 2;

	/**
	 * The number of structural features of the '<em>Push Notification Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Push Notification Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.InternalErrorImpl <em>Internal Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.InternalErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getInternalError()
	 * @generated
	 */
	int INTERNAL_ERROR = 21;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Internal Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Internal Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.AgentAuthenticationImpl <em>Agent Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.AgentAuthenticationImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentAuthentication()
	 * @generated
	 */
	int AGENT_AUTHENTICATION = 22;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_AUTHENTICATION__CREDENTIALS = 0;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_AUTHENTICATION__SCHEMES = 1;

	/**
	 * The number of structural features of the '<em>Agent Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_AUTHENTICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agent Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_AUTHENTICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.PushNotificationNotSupportedErrorImpl <em>Push Notification Not Supported Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.PushNotificationNotSupportedErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getPushNotificationNotSupportedError()
	 * @generated
	 */
	int PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Push Notification Not Supported Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Push Notification Not Supported Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.GetTaskRequestImpl <em>Get Task Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.GetTaskRequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getGetTaskRequest()
	 * @generated
	 */
	int GET_TASK_REQUEST = 24;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_REQUEST__METHOD = A2A_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_REQUEST__ID = A2A_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_REQUEST__JSONRPC = A2A_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_REQUEST__PARAMS = A2A_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Get Task Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_REQUEST_FEATURE_COUNT = A2A_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Get Task Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_REQUEST_OPERATION_COUNT = A2A_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.AgentSkillImpl <em>Agent Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.AgentSkillImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentSkill()
	 * @generated
	 */
	int AGENT_SKILL = 25;

	/**
	 * The feature id for the '<em><b>Input Modes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL__INPUT_MODES = 0;

	/**
	 * The feature id for the '<em><b>Output Modes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL__OUTPUT_MODES = 1;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL__EXAMPLES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL__ID = 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL__TAGS = 6;

	/**
	 * The number of structural features of the '<em>Agent Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Agent Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.MessageImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 26;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARTS = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.SendTaskStreamingRequestImpl <em>Send Task Streaming Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.SendTaskStreamingRequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskStreamingRequest()
	 * @generated
	 */
	int SEND_TASK_STREAMING_REQUEST = 27;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_REQUEST__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_REQUEST__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_REQUEST__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_REQUEST__PARAMS = 3;

	/**
	 * The number of structural features of the '<em>Send Task Streaming Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Send Task Streaming Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_STREAMING_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.GetTaskPushNotificationRequestImpl <em>Get Task Push Notification Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.GetTaskPushNotificationRequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getGetTaskPushNotificationRequest()
	 * @generated
	 */
	int GET_TASK_PUSH_NOTIFICATION_REQUEST = 28;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD = A2A_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_REQUEST__ID = A2A_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC = A2A_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS = A2A_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Get Task Push Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_REQUEST_FEATURE_COUNT = A2A_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Get Task Push Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_REQUEST_OPERATION_COUNT = A2A_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.JSONRPCErrorImpl <em>JSONRPC Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.JSONRPCErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONRPCError()
	 * @generated
	 */
	int JSONRPC_ERROR = 29;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>JSONRPC Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>JSONRPC Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.InvalidParamsErrorImpl <em>Invalid Params Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.InvalidParamsErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getInvalidParamsError()
	 * @generated
	 */
	int INVALID_PARAMS_ERROR = 30;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMS_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMS_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMS_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Invalid Params Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMS_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Invalid Params Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_PARAMS_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.CancelTaskResponseImpl <em>Cancel Task Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.CancelTaskResponseImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getCancelTaskResponse()
	 * @generated
	 */
	int CANCEL_TASK_RESPONSE = 31;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_RESPONSE__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_RESPONSE__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_RESPONSE__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_RESPONSE__ERROR = 3;

	/**
	 * The number of structural features of the '<em>Cancel Task Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cancel Task Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.SendTaskResponseImpl <em>Send Task Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.SendTaskResponseImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskResponse()
	 * @generated
	 */
	int SEND_TASK_RESPONSE = 32;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_RESPONSE__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_RESPONSE__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_RESPONSE__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_RESPONSE__ERROR = 3;

	/**
	 * The number of structural features of the '<em>Send Task Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Send Task Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.SetTaskPushNotificationRequestImpl <em>Set Task Push Notification Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.SetTaskPushNotificationRequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSetTaskPushNotificationRequest()
	 * @generated
	 */
	int SET_TASK_PUSH_NOTIFICATION_REQUEST = 33;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD = A2A_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_REQUEST__ID = A2A_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC = A2A_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS = A2A_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set Task Push Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_REQUEST_FEATURE_COUNT = A2A_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Set Task Push Notification Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_REQUEST_OPERATION_COUNT = A2A_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TextPartImpl <em>Text Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TextPartImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTextPart()
	 * @generated
	 */
	int TEXT_PART = 34;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PART__METADATA = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PART__TEXT = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PART__TYPE = PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PART_FEATURE_COUNT = PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PART_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.GetTaskResponseImpl <em>Get Task Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.GetTaskResponseImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getGetTaskResponse()
	 * @generated
	 */
	int GET_TASK_RESPONSE = 35;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_RESPONSE__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_RESPONSE__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_RESPONSE__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_RESPONSE__ERROR = 3;

	/**
	 * The number of structural features of the '<em>Get Task Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Get Task Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskSendParamsImpl <em>Task Send Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskSendParamsImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskSendParams()
	 * @generated
	 */
	int TASK_SEND_PARAMS = 36;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SEND_PARAMS__METADATA = 0;

	/**
	 * The feature id for the '<em><b>History Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SEND_PARAMS__HISTORY_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SEND_PARAMS__ID = 2;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SEND_PARAMS__SESSION_ID = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SEND_PARAMS__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Push Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SEND_PARAMS__PUSH_NOTIFICATION = 5;

	/**
	 * The number of structural features of the '<em>Task Send Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SEND_PARAMS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Task Send Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SEND_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskStatusImpl <em>Task Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskStatusImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskStatus()
	 * @generated
	 */
	int TASK_STATUS = 37;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS__STATE = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Task Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.ArtifactImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 38;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Last Chunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__LAST_CHUNK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PARTS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__INDEX = 5;

	/**
	 * The feature id for the '<em><b>Append</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__APPEND = 6;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.SetTaskPushNotificationResponseImpl <em>Set Task Push Notification Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.SetTaskPushNotificationResponseImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSetTaskPushNotificationResponse()
	 * @generated
	 */
	int SET_TASK_PUSH_NOTIFICATION_RESPONSE = 39;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_RESPONSE__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_RESPONSE__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_RESPONSE__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_RESPONSE__ERROR = 3;

	/**
	 * The number of structural features of the '<em>Set Task Push Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Set Task Push Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TASK_PUSH_NOTIFICATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.FileContentImpl <em>File Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.FileContentImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getFileContent()
	 * @generated
	 */
	int FILE_CONTENT = 40;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT__MIME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT__URI = 3;

	/**
	 * The number of structural features of the '<em>File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.MethodNotFoundErrorImpl <em>Method Not Found Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.MethodNotFoundErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getMethodNotFoundError()
	 * @generated
	 */
	int METHOD_NOT_FOUND_ERROR = 41;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NOT_FOUND_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NOT_FOUND_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NOT_FOUND_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Method Not Found Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NOT_FOUND_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Method Not Found Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_NOT_FOUND_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskResubscriptionRequestImpl <em>Task Resubscription Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskResubscriptionRequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskResubscriptionRequest()
	 * @generated
	 */
	int TASK_RESUBSCRIPTION_REQUEST = 42;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESUBSCRIPTION_REQUEST__METHOD = A2A_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESUBSCRIPTION_REQUEST__ID = A2A_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESUBSCRIPTION_REQUEST__JSONRPC = A2A_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESUBSCRIPTION_REQUEST__PARAMS = A2A_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Resubscription Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESUBSCRIPTION_REQUEST_FEATURE_COUNT = A2A_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task Resubscription Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESUBSCRIPTION_REQUEST_OPERATION_COUNT = A2A_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.JSONRPCMessageImpl <em>JSONRPC Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.JSONRPCMessageImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONRPCMessage()
	 * @generated
	 */
	int JSONRPC_MESSAGE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_MESSAGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_MESSAGE__JSONRPC = 1;

	/**
	 * The number of structural features of the '<em>JSONRPC Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>JSONRPC Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSONRPC_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskIdParamsImpl <em>Task Id Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskIdParamsImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskIdParams()
	 * @generated
	 */
	int TASK_ID_PARAMS = 44;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ID_PARAMS__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ID_PARAMS__ID = 1;

	/**
	 * The number of structural features of the '<em>Task Id Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ID_PARAMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Id Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ID_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskNotCancelableErrorImpl <em>Task Not Cancelable Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskNotCancelableErrorImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskNotCancelableError()
	 * @generated
	 */
	int TASK_NOT_CANCELABLE_ERROR = 45;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_CANCELABLE_ERROR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_CANCELABLE_ERROR__DATA = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_CANCELABLE_ERROR__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Task Not Cancelable Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_CANCELABLE_ERROR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Not Cancelable Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NOT_CANCELABLE_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.CancelTaskRequestImpl <em>Cancel Task Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.CancelTaskRequestImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getCancelTaskRequest()
	 * @generated
	 */
	int CANCEL_TASK_REQUEST = 46;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_REQUEST__METHOD = A2A_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_REQUEST__ID = A2A_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_REQUEST__JSONRPC = A2A_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_REQUEST__PARAMS = A2A_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cancel Task Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_REQUEST_FEATURE_COUNT = A2A_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cancel Task Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TASK_REQUEST_OPERATION_COUNT = A2A_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.GetTaskPushNotificationResponseImpl <em>Get Task Push Notification Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.GetTaskPushNotificationResponseImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getGetTaskPushNotificationResponse()
	 * @generated
	 */
	int GET_TASK_PUSH_NOTIFICATION_RESPONSE = 47;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_RESPONSE__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_RESPONSE__ID = 1;

	/**
	 * The feature id for the '<em><b>Jsonrpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_RESPONSE__JSONRPC = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_RESPONSE__ERROR = 3;

	/**
	 * The number of structural features of the '<em>Get Task Push Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Get Task Push Notification Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TASK_PUSH_NOTIFICATION_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.TaskArtifactUpdateEventImpl <em>Task Artifact Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.TaskArtifactUpdateEventImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskArtifactUpdateEvent()
	 * @generated
	 */
	int TASK_ARTIFACT_UPDATE_EVENT = 48;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARTIFACT_UPDATE_EVENT__METADATA = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARTIFACT_UPDATE_EVENT__ID = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Artifact Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARTIFACT_UPDATE_EVENT_FEATURE_COUNT = SEND_TASK_STREAMING_RESPONSE_RESULT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Artifact Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARTIFACT_UPDATE_EVENT_OPERATION_COUNT = SEND_TASK_STREAMING_RESPONSE_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.impl.AgentProviderImpl <em>Agent Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.impl.AgentProviderImpl
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentProvider()
	 * @generated
	 */
	int AGENT_PROVIDER = 49;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_PROVIDER__ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_PROVIDER__URL = 1;

	/**
	 * The number of structural features of the '<em>Agent Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agent Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.a2a.TaskState <em>Task State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.a2a.TaskState
	 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskState()
	 * @generated
	 */
	int TASK_STATE = 50;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.nasdanika.models.a2a.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.Task#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.Task#getMetadata()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.Task#getSessionId <em>Session Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Id</em>'.
	 * @see org.nasdanika.models.a2a.Task#getSessionId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_SessionId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.a2a.Task#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>History</em>'.
	 * @see org.nasdanika.models.a2a.Task#getHistory()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_History();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.Task#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.nasdanika.models.a2a.Task#getStatus()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.a2a.Task#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.nasdanika.models.a2a.Task#getArtifacts()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Artifacts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.UnsupportedOperationError <em>Unsupported Operation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsupported Operation Error</em>'.
	 * @see org.nasdanika.models.a2a.UnsupportedOperationError
	 * @generated
	 */
	EClass getUnsupportedOperationError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.UnsupportedOperationError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.UnsupportedOperationError#getCode()
	 * @see #getUnsupportedOperationError()
	 * @generated
	 */
	EAttribute getUnsupportedOperationError_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.UnsupportedOperationError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.UnsupportedOperationError#getData()
	 * @see #getUnsupportedOperationError()
	 * @generated
	 */
	EAttribute getUnsupportedOperationError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.UnsupportedOperationError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.UnsupportedOperationError#getMessage()
	 * @see #getUnsupportedOperationError()
	 * @generated
	 */
	EAttribute getUnsupportedOperationError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.JSONRPCRequest <em>JSONRPC Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSONRPC Request</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCRequest
	 * @generated
	 */
	EClass getJSONRPCRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCRequest#getMethod()
	 * @see #getJSONRPCRequest()
	 * @generated
	 */
	EAttribute getJSONRPCRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCRequest#getId()
	 * @see #getJSONRPCRequest()
	 * @generated
	 */
	EAttribute getJSONRPCRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCRequest#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCRequest#getJsonrpc()
	 * @see #getJSONRPCRequest()
	 * @generated
	 */
	EAttribute getJSONRPCRequest_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.JSONRPCRequest#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCRequest#getParams()
	 * @see #getJSONRPCRequest()
	 * @generated
	 */
	EReference getJSONRPCRequest_Params();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent <em>Task Status Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Status Update Event</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatusUpdateEvent
	 * @generated
	 */
	EClass getTaskStatusUpdateEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatusUpdateEvent#getMetadata()
	 * @see #getTaskStatusUpdateEvent()
	 * @generated
	 */
	EReference getTaskStatusUpdateEvent_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatusUpdateEvent#getFinal()
	 * @see #getTaskStatusUpdateEvent()
	 * @generated
	 */
	EAttribute getTaskStatusUpdateEvent_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatusUpdateEvent#getId()
	 * @see #getTaskStatusUpdateEvent()
	 * @generated
	 */
	EAttribute getTaskStatusUpdateEvent_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatusUpdateEvent#getStatus()
	 * @see #getTaskStatusUpdateEvent()
	 * @generated
	 */
	EReference getTaskStatusUpdateEvent_Status();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.AuthenticationInfo <em>Authentication Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Info</em>'.
	 * @see org.nasdanika.models.a2a.AuthenticationInfo
	 * @generated
	 */
	EClass getAuthenticationInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AuthenticationInfo#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credentials</em>'.
	 * @see org.nasdanika.models.a2a.AuthenticationInfo#getCredentials()
	 * @see #getAuthenticationInfo()
	 * @generated
	 */
	EAttribute getAuthenticationInfo_Credentials();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.a2a.AuthenticationInfo#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see org.nasdanika.models.a2a.AuthenticationInfo#getSchemes()
	 * @see #getAuthenticationInfo()
	 * @generated
	 */
	EAttribute getAuthenticationInfo_Schemes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.SendTaskStreamingResponseResult <em>Send Task Streaming Response Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Task Streaming Response Result</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingResponseResult
	 * @generated
	 */
	EClass getSendTaskStreamingResponseResult();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse <em>Send Task Streaming Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Task Streaming Response</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingResponse
	 * @generated
	 */
	EClass getSendTaskStreamingResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingResponse#getResult()
	 * @see #getSendTaskStreamingResponse()
	 * @generated
	 */
	EReference getSendTaskStreamingResponse_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingResponse#getId()
	 * @see #getSendTaskStreamingResponse()
	 * @generated
	 */
	EAttribute getSendTaskStreamingResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingResponse#getJsonrpc()
	 * @see #getSendTaskStreamingResponse()
	 * @generated
	 */
	EAttribute getSendTaskStreamingResponse_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingResponse#getError()
	 * @see #getSendTaskStreamingResponse()
	 * @generated
	 */
	EReference getSendTaskStreamingResponse_Error();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskPushNotificationConfig <em>Task Push Notification Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Push Notification Config</em>'.
	 * @see org.nasdanika.models.a2a.TaskPushNotificationConfig
	 * @generated
	 */
	EClass getTaskPushNotificationConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskPushNotificationConfig#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.TaskPushNotificationConfig#getId()
	 * @see #getTaskPushNotificationConfig()
	 * @generated
	 */
	EAttribute getTaskPushNotificationConfig_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskPushNotificationConfig#getPushNotificationConfig <em>Push Notification Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Push Notification Config</em>'.
	 * @see org.nasdanika.models.a2a.TaskPushNotificationConfig#getPushNotificationConfig()
	 * @see #getTaskPushNotificationConfig()
	 * @generated
	 */
	EReference getTaskPushNotificationConfig_PushNotificationConfig();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.AgentCard <em>Agent Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Card</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard
	 * @generated
	 */
	EClass getAgentCard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.a2a.AgentCard#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getSkills()
	 * @see #getAgentCard()
	 * @generated
	 */
	EReference getAgentCard_Skills();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentCard#getDocumentationUrl <em>Documentation Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation Url</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getDocumentationUrl()
	 * @see #getAgentCard()
	 * @generated
	 */
	EAttribute getAgentCard_DocumentationUrl();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.AgentCard#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getCapabilities()
	 * @see #getAgentCard()
	 * @generated
	 */
	EReference getAgentCard_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.AgentCard#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getProvider()
	 * @see #getAgentCard()
	 * @generated
	 */
	EReference getAgentCard_Provider();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.a2a.AgentCard#getDefaultOutputModes <em>Default Output Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Output Modes</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getDefaultOutputModes()
	 * @see #getAgentCard()
	 * @generated
	 */
	EAttribute getAgentCard_DefaultOutputModes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getName()
	 * @see #getAgentCard()
	 * @generated
	 */
	EAttribute getAgentCard_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentCard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getDescription()
	 * @see #getAgentCard()
	 * @generated
	 */
	EAttribute getAgentCard_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentCard#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getVersion()
	 * @see #getAgentCard()
	 * @generated
	 */
	EAttribute getAgentCard_Version();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.a2a.AgentCard#getDefaultInputModes <em>Default Input Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Input Modes</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getDefaultInputModes()
	 * @see #getAgentCard()
	 * @generated
	 */
	EAttribute getAgentCard_DefaultInputModes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentCard#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getUrl()
	 * @see #getAgentCard()
	 * @generated
	 */
	EAttribute getAgentCard_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.AgentCard#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see org.nasdanika.models.a2a.AgentCard#getAuthentication()
	 * @see #getAgentCard()
	 * @generated
	 */
	EReference getAgentCard_Authentication();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.AgentCapabilities <em>Agent Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Capabilities</em>'.
	 * @see org.nasdanika.models.a2a.AgentCapabilities
	 * @generated
	 */
	EClass getAgentCapabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentCapabilities#getStreaming <em>Streaming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Streaming</em>'.
	 * @see org.nasdanika.models.a2a.AgentCapabilities#getStreaming()
	 * @see #getAgentCapabilities()
	 * @generated
	 */
	EAttribute getAgentCapabilities_Streaming();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentCapabilities#getPushNotifications <em>Push Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Push Notifications</em>'.
	 * @see org.nasdanika.models.a2a.AgentCapabilities#getPushNotifications()
	 * @see #getAgentCapabilities()
	 * @generated
	 */
	EAttribute getAgentCapabilities_PushNotifications();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentCapabilities#getStateTransitionHistory <em>State Transition History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Transition History</em>'.
	 * @see org.nasdanika.models.a2a.AgentCapabilities#getStateTransitionHistory()
	 * @see #getAgentCapabilities()
	 * @generated
	 */
	EAttribute getAgentCapabilities_StateTransitionHistory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.SendTaskRequest <em>Send Task Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Task Request</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskRequest
	 * @generated
	 */
	EClass getSendTaskRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskRequest#getMethod()
	 * @see #getSendTaskRequest()
	 * @generated
	 */
	EAttribute getSendTaskRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskRequest#getId()
	 * @see #getSendTaskRequest()
	 * @generated
	 */
	EAttribute getSendTaskRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskRequest#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskRequest#getJsonrpc()
	 * @see #getSendTaskRequest()
	 * @generated
	 */
	EAttribute getSendTaskRequest_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SendTaskRequest#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskRequest#getParams()
	 * @see #getSendTaskRequest()
	 * @generated
	 */
	EReference getSendTaskRequest_Params();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.JSONParseError <em>JSON Parse Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Parse Error</em>'.
	 * @see org.nasdanika.models.a2a.JSONParseError
	 * @generated
	 */
	EClass getJSONParseError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONParseError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.JSONParseError#getCode()
	 * @see #getJSONParseError()
	 * @generated
	 */
	EAttribute getJSONParseError_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.JSONParseError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.JSONParseError#getData()
	 * @see #getJSONParseError()
	 * @generated
	 */
	EReference getJSONParseError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONParseError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.JSONParseError#getMessage()
	 * @see #getJSONParseError()
	 * @generated
	 */
	EAttribute getJSONParseError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.DataPart <em>Data Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Part</em>'.
	 * @see org.nasdanika.models.a2a.DataPart
	 * @generated
	 */
	EClass getDataPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.DataPart#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.DataPart#getMetadata()
	 * @see #getDataPart()
	 * @generated
	 */
	EReference getDataPart_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.DataPart#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.DataPart#getData()
	 * @see #getDataPart()
	 * @generated
	 */
	EReference getDataPart_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.DataPart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.a2a.DataPart#getType()
	 * @see #getDataPart()
	 * @generated
	 */
	EAttribute getDataPart_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.InvalidRequestError <em>Invalid Request Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Request Error</em>'.
	 * @see org.nasdanika.models.a2a.InvalidRequestError
	 * @generated
	 */
	EClass getInvalidRequestError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.InvalidRequestError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.InvalidRequestError#getCode()
	 * @see #getInvalidRequestError()
	 * @generated
	 */
	EAttribute getInvalidRequestError_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.InvalidRequestError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.InvalidRequestError#getData()
	 * @see #getInvalidRequestError()
	 * @generated
	 */
	EReference getInvalidRequestError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.InvalidRequestError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.InvalidRequestError#getMessage()
	 * @see #getInvalidRequestError()
	 * @generated
	 */
	EAttribute getInvalidRequestError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.A2ARequest <em>A2A Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A2A Request</em>'.
	 * @see org.nasdanika.models.a2a.A2ARequest
	 * @generated
	 */
	EClass getA2ARequest();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskNotFoundError <em>Task Not Found Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Not Found Error</em>'.
	 * @see org.nasdanika.models.a2a.TaskNotFoundError
	 * @generated
	 */
	EClass getTaskNotFoundError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskNotFoundError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.TaskNotFoundError#getCode()
	 * @see #getTaskNotFoundError()
	 * @generated
	 */
	EAttribute getTaskNotFoundError_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskNotFoundError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.TaskNotFoundError#getData()
	 * @see #getTaskNotFoundError()
	 * @generated
	 */
	EAttribute getTaskNotFoundError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskNotFoundError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.TaskNotFoundError#getMessage()
	 * @see #getTaskNotFoundError()
	 * @generated
	 */
	EAttribute getTaskNotFoundError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.JSONRPCResponse <em>JSONRPC Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSONRPC Response</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCResponse
	 * @generated
	 */
	EClass getJSONRPCResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.JSONRPCResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCResponse#getResult()
	 * @see #getJSONRPCResponse()
	 * @generated
	 */
	EReference getJSONRPCResponse_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCResponse#getId()
	 * @see #getJSONRPCResponse()
	 * @generated
	 */
	EAttribute getJSONRPCResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCResponse#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCResponse#getJsonrpc()
	 * @see #getJSONRPCResponse()
	 * @generated
	 */
	EAttribute getJSONRPCResponse_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.JSONRPCResponse#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCResponse#getError()
	 * @see #getJSONRPCResponse()
	 * @generated
	 */
	EReference getJSONRPCResponse_Error();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.FilePart <em>File Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Part</em>'.
	 * @see org.nasdanika.models.a2a.FilePart
	 * @generated
	 */
	EClass getFilePart();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.FilePart#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.FilePart#getMetadata()
	 * @see #getFilePart()
	 * @generated
	 */
	EReference getFilePart_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.FilePart#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see org.nasdanika.models.a2a.FilePart#getFile()
	 * @see #getFilePart()
	 * @generated
	 */
	EReference getFilePart_File();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.FilePart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.a2a.FilePart#getType()
	 * @see #getFilePart()
	 * @generated
	 */
	EAttribute getFilePart_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskQueryParams <em>Task Query Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Query Params</em>'.
	 * @see org.nasdanika.models.a2a.TaskQueryParams
	 * @generated
	 */
	EClass getTaskQueryParams();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskQueryParams#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.TaskQueryParams#getMetadata()
	 * @see #getTaskQueryParams()
	 * @generated
	 */
	EReference getTaskQueryParams_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskQueryParams#getHistoryLength <em>History Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History Length</em>'.
	 * @see org.nasdanika.models.a2a.TaskQueryParams#getHistoryLength()
	 * @see #getTaskQueryParams()
	 * @generated
	 */
	EAttribute getTaskQueryParams_HistoryLength();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskQueryParams#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.TaskQueryParams#getId()
	 * @see #getTaskQueryParams()
	 * @generated
	 */
	EAttribute getTaskQueryParams_Id();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.PushNotificationConfig <em>Push Notification Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Notification Config</em>'.
	 * @see org.nasdanika.models.a2a.PushNotificationConfig
	 * @generated
	 */
	EClass getPushNotificationConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.PushNotificationConfig#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.a2a.PushNotificationConfig#getUrl()
	 * @see #getPushNotificationConfig()
	 * @generated
	 */
	EAttribute getPushNotificationConfig_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.PushNotificationConfig#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.nasdanika.models.a2a.PushNotificationConfig#getToken()
	 * @see #getPushNotificationConfig()
	 * @generated
	 */
	EAttribute getPushNotificationConfig_Token();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.PushNotificationConfig#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see org.nasdanika.models.a2a.PushNotificationConfig#getAuthentication()
	 * @see #getPushNotificationConfig()
	 * @generated
	 */
	EReference getPushNotificationConfig_Authentication();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see org.nasdanika.models.a2a.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.InternalError <em>Internal Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Error</em>'.
	 * @see org.nasdanika.models.a2a.InternalError
	 * @generated
	 */
	EClass getInternalError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.InternalError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.InternalError#getCode()
	 * @see #getInternalError()
	 * @generated
	 */
	EAttribute getInternalError_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.InternalError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.InternalError#getData()
	 * @see #getInternalError()
	 * @generated
	 */
	EReference getInternalError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.InternalError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.InternalError#getMessage()
	 * @see #getInternalError()
	 * @generated
	 */
	EAttribute getInternalError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.AgentAuthentication <em>Agent Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Authentication</em>'.
	 * @see org.nasdanika.models.a2a.AgentAuthentication
	 * @generated
	 */
	EClass getAgentAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentAuthentication#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credentials</em>'.
	 * @see org.nasdanika.models.a2a.AgentAuthentication#getCredentials()
	 * @see #getAgentAuthentication()
	 * @generated
	 */
	EAttribute getAgentAuthentication_Credentials();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.a2a.AgentAuthentication#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see org.nasdanika.models.a2a.AgentAuthentication#getSchemes()
	 * @see #getAgentAuthentication()
	 * @generated
	 */
	EAttribute getAgentAuthentication_Schemes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.PushNotificationNotSupportedError <em>Push Notification Not Supported Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Notification Not Supported Error</em>'.
	 * @see org.nasdanika.models.a2a.PushNotificationNotSupportedError
	 * @generated
	 */
	EClass getPushNotificationNotSupportedError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.PushNotificationNotSupportedError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.PushNotificationNotSupportedError#getCode()
	 * @see #getPushNotificationNotSupportedError()
	 * @generated
	 */
	EAttribute getPushNotificationNotSupportedError_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.PushNotificationNotSupportedError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.PushNotificationNotSupportedError#getData()
	 * @see #getPushNotificationNotSupportedError()
	 * @generated
	 */
	EAttribute getPushNotificationNotSupportedError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.PushNotificationNotSupportedError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.PushNotificationNotSupportedError#getMessage()
	 * @see #getPushNotificationNotSupportedError()
	 * @generated
	 */
	EAttribute getPushNotificationNotSupportedError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.GetTaskRequest <em>Get Task Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Task Request</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskRequest
	 * @generated
	 */
	EClass getGetTaskRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskRequest#getMethod()
	 * @see #getGetTaskRequest()
	 * @generated
	 */
	EAttribute getGetTaskRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskRequest#getId()
	 * @see #getGetTaskRequest()
	 * @generated
	 */
	EAttribute getGetTaskRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskRequest#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskRequest#getJsonrpc()
	 * @see #getGetTaskRequest()
	 * @generated
	 */
	EAttribute getGetTaskRequest_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.GetTaskRequest#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskRequest#getParams()
	 * @see #getGetTaskRequest()
	 * @generated
	 */
	EReference getGetTaskRequest_Params();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.AgentSkill <em>Agent Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Skill</em>'.
	 * @see org.nasdanika.models.a2a.AgentSkill
	 * @generated
	 */
	EClass getAgentSkill();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.a2a.AgentSkill#getInputModes <em>Input Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input Modes</em>'.
	 * @see org.nasdanika.models.a2a.AgentSkill#getInputModes()
	 * @see #getAgentSkill()
	 * @generated
	 */
	EAttribute getAgentSkill_InputModes();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.a2a.AgentSkill#getOutputModes <em>Output Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Modes</em>'.
	 * @see org.nasdanika.models.a2a.AgentSkill#getOutputModes()
	 * @see #getAgentSkill()
	 * @generated
	 */
	EAttribute getAgentSkill_OutputModes();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.a2a.AgentSkill#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Examples</em>'.
	 * @see org.nasdanika.models.a2a.AgentSkill#getExamples()
	 * @see #getAgentSkill()
	 * @generated
	 */
	EAttribute getAgentSkill_Examples();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentSkill#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.a2a.AgentSkill#getName()
	 * @see #getAgentSkill()
	 * @generated
	 */
	EAttribute getAgentSkill_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentSkill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.a2a.AgentSkill#getDescription()
	 * @see #getAgentSkill()
	 * @generated
	 */
	EAttribute getAgentSkill_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentSkill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.AgentSkill#getId()
	 * @see #getAgentSkill()
	 * @generated
	 */
	EAttribute getAgentSkill_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.a2a.AgentSkill#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.nasdanika.models.a2a.AgentSkill#getTags()
	 * @see #getAgentSkill()
	 * @generated
	 */
	EAttribute getAgentSkill_Tags();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.Message#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.Message#getMetadata()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.Message#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.nasdanika.models.a2a.Message#getRole()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.a2a.Message#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.nasdanika.models.a2a.Message#getParts()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Parts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.SendTaskStreamingRequest <em>Send Task Streaming Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Task Streaming Request</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingRequest
	 * @generated
	 */
	EClass getSendTaskStreamingRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskStreamingRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingRequest#getMethod()
	 * @see #getSendTaskStreamingRequest()
	 * @generated
	 */
	EAttribute getSendTaskStreamingRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskStreamingRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingRequest#getId()
	 * @see #getSendTaskStreamingRequest()
	 * @generated
	 */
	EAttribute getSendTaskStreamingRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskStreamingRequest#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingRequest#getJsonrpc()
	 * @see #getSendTaskStreamingRequest()
	 * @generated
	 */
	EAttribute getSendTaskStreamingRequest_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SendTaskStreamingRequest#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingRequest#getParams()
	 * @see #getSendTaskStreamingRequest()
	 * @generated
	 */
	EReference getSendTaskStreamingRequest_Params();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.GetTaskPushNotificationRequest <em>Get Task Push Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Task Push Notification Request</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationRequest
	 * @generated
	 */
	EClass getGetTaskPushNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskPushNotificationRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationRequest#getMethod()
	 * @see #getGetTaskPushNotificationRequest()
	 * @generated
	 */
	EAttribute getGetTaskPushNotificationRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskPushNotificationRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationRequest#getId()
	 * @see #getGetTaskPushNotificationRequest()
	 * @generated
	 */
	EAttribute getGetTaskPushNotificationRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskPushNotificationRequest#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationRequest#getJsonrpc()
	 * @see #getGetTaskPushNotificationRequest()
	 * @generated
	 */
	EAttribute getGetTaskPushNotificationRequest_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.GetTaskPushNotificationRequest#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationRequest#getParams()
	 * @see #getGetTaskPushNotificationRequest()
	 * @generated
	 */
	EReference getGetTaskPushNotificationRequest_Params();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.JSONRPCError <em>JSONRPC Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSONRPC Error</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCError
	 * @generated
	 */
	EClass getJSONRPCError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCError#getCode()
	 * @see #getJSONRPCError()
	 * @generated
	 */
	EAttribute getJSONRPCError_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.JSONRPCError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCError#getData()
	 * @see #getJSONRPCError()
	 * @generated
	 */
	EReference getJSONRPCError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCError#getMessage()
	 * @see #getJSONRPCError()
	 * @generated
	 */
	EAttribute getJSONRPCError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.InvalidParamsError <em>Invalid Params Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Params Error</em>'.
	 * @see org.nasdanika.models.a2a.InvalidParamsError
	 * @generated
	 */
	EClass getInvalidParamsError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.InvalidParamsError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.InvalidParamsError#getCode()
	 * @see #getInvalidParamsError()
	 * @generated
	 */
	EAttribute getInvalidParamsError_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.InvalidParamsError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.InvalidParamsError#getData()
	 * @see #getInvalidParamsError()
	 * @generated
	 */
	EReference getInvalidParamsError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.InvalidParamsError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.InvalidParamsError#getMessage()
	 * @see #getInvalidParamsError()
	 * @generated
	 */
	EAttribute getInvalidParamsError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.CancelTaskResponse <em>Cancel Task Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Task Response</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskResponse
	 * @generated
	 */
	EClass getCancelTaskResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.CancelTaskResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskResponse#getResult()
	 * @see #getCancelTaskResponse()
	 * @generated
	 */
	EReference getCancelTaskResponse_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.CancelTaskResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskResponse#getId()
	 * @see #getCancelTaskResponse()
	 * @generated
	 */
	EAttribute getCancelTaskResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.CancelTaskResponse#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskResponse#getJsonrpc()
	 * @see #getCancelTaskResponse()
	 * @generated
	 */
	EAttribute getCancelTaskResponse_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.CancelTaskResponse#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskResponse#getError()
	 * @see #getCancelTaskResponse()
	 * @generated
	 */
	EReference getCancelTaskResponse_Error();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.SendTaskResponse <em>Send Task Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Task Response</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskResponse
	 * @generated
	 */
	EClass getSendTaskResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SendTaskResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskResponse#getResult()
	 * @see #getSendTaskResponse()
	 * @generated
	 */
	EReference getSendTaskResponse_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskResponse#getId()
	 * @see #getSendTaskResponse()
	 * @generated
	 */
	EAttribute getSendTaskResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SendTaskResponse#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskResponse#getJsonrpc()
	 * @see #getSendTaskResponse()
	 * @generated
	 */
	EAttribute getSendTaskResponse_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SendTaskResponse#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.nasdanika.models.a2a.SendTaskResponse#getError()
	 * @see #getSendTaskResponse()
	 * @generated
	 */
	EReference getSendTaskResponse_Error();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest <em>Set Task Push Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Task Push Notification Request</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationRequest
	 * @generated
	 */
	EClass getSetTaskPushNotificationRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getMethod()
	 * @see #getSetTaskPushNotificationRequest()
	 * @generated
	 */
	EAttribute getSetTaskPushNotificationRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getId()
	 * @see #getSetTaskPushNotificationRequest()
	 * @generated
	 */
	EAttribute getSetTaskPushNotificationRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getJsonrpc()
	 * @see #getSetTaskPushNotificationRequest()
	 * @generated
	 */
	EAttribute getSetTaskPushNotificationRequest_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getParams()
	 * @see #getSetTaskPushNotificationRequest()
	 * @generated
	 */
	EReference getSetTaskPushNotificationRequest_Params();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TextPart <em>Text Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Part</em>'.
	 * @see org.nasdanika.models.a2a.TextPart
	 * @generated
	 */
	EClass getTextPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TextPart#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.TextPart#getMetadata()
	 * @see #getTextPart()
	 * @generated
	 */
	EReference getTextPart_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TextPart#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.a2a.TextPart#getText()
	 * @see #getTextPart()
	 * @generated
	 */
	EAttribute getTextPart_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TextPart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.a2a.TextPart#getType()
	 * @see #getTextPart()
	 * @generated
	 */
	EAttribute getTextPart_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.GetTaskResponse <em>Get Task Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Task Response</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskResponse
	 * @generated
	 */
	EClass getGetTaskResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.GetTaskResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskResponse#getResult()
	 * @see #getGetTaskResponse()
	 * @generated
	 */
	EReference getGetTaskResponse_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskResponse#getId()
	 * @see #getGetTaskResponse()
	 * @generated
	 */
	EAttribute getGetTaskResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskResponse#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskResponse#getJsonrpc()
	 * @see #getGetTaskResponse()
	 * @generated
	 */
	EAttribute getGetTaskResponse_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.GetTaskResponse#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskResponse#getError()
	 * @see #getGetTaskResponse()
	 * @generated
	 */
	EReference getGetTaskResponse_Error();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskSendParams <em>Task Send Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Send Params</em>'.
	 * @see org.nasdanika.models.a2a.TaskSendParams
	 * @generated
	 */
	EClass getTaskSendParams();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskSendParams#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.TaskSendParams#getMetadata()
	 * @see #getTaskSendParams()
	 * @generated
	 */
	EReference getTaskSendParams_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskSendParams#getHistoryLength <em>History Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History Length</em>'.
	 * @see org.nasdanika.models.a2a.TaskSendParams#getHistoryLength()
	 * @see #getTaskSendParams()
	 * @generated
	 */
	EAttribute getTaskSendParams_HistoryLength();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskSendParams#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.TaskSendParams#getId()
	 * @see #getTaskSendParams()
	 * @generated
	 */
	EAttribute getTaskSendParams_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskSendParams#getSessionId <em>Session Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Id</em>'.
	 * @see org.nasdanika.models.a2a.TaskSendParams#getSessionId()
	 * @see #getTaskSendParams()
	 * @generated
	 */
	EAttribute getTaskSendParams_SessionId();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskSendParams#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.TaskSendParams#getMessage()
	 * @see #getTaskSendParams()
	 * @generated
	 */
	EReference getTaskSendParams_Message();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskSendParams#getPushNotification <em>Push Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Push Notification</em>'.
	 * @see org.nasdanika.models.a2a.TaskSendParams#getPushNotification()
	 * @see #getTaskSendParams()
	 * @generated
	 */
	EReference getTaskSendParams_PushNotification();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Status</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatus
	 * @generated
	 */
	EClass getTaskStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskStatus#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatus#getState()
	 * @see #getTaskStatus()
	 * @generated
	 */
	EAttribute getTaskStatus_State();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatus#getMessage()
	 * @see #getTaskStatus()
	 * @generated
	 */
	EReference getTaskStatus_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskStatus#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.nasdanika.models.a2a.TaskStatus#getTimestamp()
	 * @see #getTaskStatus()
	 * @generated
	 */
	EAttribute getTaskStatus_Timestamp();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.nasdanika.models.a2a.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.Artifact#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.Artifact#getMetadata()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.Artifact#getLastChunk <em>Last Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Chunk</em>'.
	 * @see org.nasdanika.models.a2a.Artifact#getLastChunk()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_LastChunk();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.a2a.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.a2a.Artifact#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.nasdanika.models.a2a.Artifact#getParts()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Parts();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.Artifact#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.a2a.Artifact#getDescription()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.Artifact#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.nasdanika.models.a2a.Artifact#getIndex()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.Artifact#getAppend <em>Append</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Append</em>'.
	 * @see org.nasdanika.models.a2a.Artifact#getAppend()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Append();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse <em>Set Task Push Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Task Push Notification Response</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationResponse
	 * @generated
	 */
	EClass getSetTaskPushNotificationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getResult()
	 * @see #getSetTaskPushNotificationResponse()
	 * @generated
	 */
	EReference getSetTaskPushNotificationResponse_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getId()
	 * @see #getSetTaskPushNotificationResponse()
	 * @generated
	 */
	EAttribute getSetTaskPushNotificationResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getJsonrpc()
	 * @see #getSetTaskPushNotificationResponse()
	 * @generated
	 */
	EAttribute getSetTaskPushNotificationResponse_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getError()
	 * @see #getSetTaskPushNotificationResponse()
	 * @generated
	 */
	EReference getSetTaskPushNotificationResponse_Error();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.FileContent <em>File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Content</em>'.
	 * @see org.nasdanika.models.a2a.FileContent
	 * @generated
	 */
	EClass getFileContent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.FileContent#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see org.nasdanika.models.a2a.FileContent#getBytes()
	 * @see #getFileContent()
	 * @generated
	 */
	EAttribute getFileContent_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.FileContent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.a2a.FileContent#getName()
	 * @see #getFileContent()
	 * @generated
	 */
	EAttribute getFileContent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.FileContent#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.nasdanika.models.a2a.FileContent#getMimeType()
	 * @see #getFileContent()
	 * @generated
	 */
	EAttribute getFileContent_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.FileContent#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.nasdanika.models.a2a.FileContent#getUri()
	 * @see #getFileContent()
	 * @generated
	 */
	EAttribute getFileContent_Uri();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.MethodNotFoundError <em>Method Not Found Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Not Found Error</em>'.
	 * @see org.nasdanika.models.a2a.MethodNotFoundError
	 * @generated
	 */
	EClass getMethodNotFoundError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.MethodNotFoundError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.MethodNotFoundError#getCode()
	 * @see #getMethodNotFoundError()
	 * @generated
	 */
	EAttribute getMethodNotFoundError_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.MethodNotFoundError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.MethodNotFoundError#getData()
	 * @see #getMethodNotFoundError()
	 * @generated
	 */
	EAttribute getMethodNotFoundError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.MethodNotFoundError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.MethodNotFoundError#getMessage()
	 * @see #getMethodNotFoundError()
	 * @generated
	 */
	EAttribute getMethodNotFoundError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskResubscriptionRequest <em>Task Resubscription Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Resubscription Request</em>'.
	 * @see org.nasdanika.models.a2a.TaskResubscriptionRequest
	 * @generated
	 */
	EClass getTaskResubscriptionRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskResubscriptionRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.a2a.TaskResubscriptionRequest#getMethod()
	 * @see #getTaskResubscriptionRequest()
	 * @generated
	 */
	EAttribute getTaskResubscriptionRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskResubscriptionRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.TaskResubscriptionRequest#getId()
	 * @see #getTaskResubscriptionRequest()
	 * @generated
	 */
	EAttribute getTaskResubscriptionRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskResubscriptionRequest#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.TaskResubscriptionRequest#getJsonrpc()
	 * @see #getTaskResubscriptionRequest()
	 * @generated
	 */
	EAttribute getTaskResubscriptionRequest_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskResubscriptionRequest#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see org.nasdanika.models.a2a.TaskResubscriptionRequest#getParams()
	 * @see #getTaskResubscriptionRequest()
	 * @generated
	 */
	EReference getTaskResubscriptionRequest_Params();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.JSONRPCMessage <em>JSONRPC Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSONRPC Message</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCMessage
	 * @generated
	 */
	EClass getJSONRPCMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCMessage#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCMessage#getId()
	 * @see #getJSONRPCMessage()
	 * @generated
	 */
	EAttribute getJSONRPCMessage_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.JSONRPCMessage#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.JSONRPCMessage#getJsonrpc()
	 * @see #getJSONRPCMessage()
	 * @generated
	 */
	EAttribute getJSONRPCMessage_Jsonrpc();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskIdParams <em>Task Id Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Id Params</em>'.
	 * @see org.nasdanika.models.a2a.TaskIdParams
	 * @generated
	 */
	EClass getTaskIdParams();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskIdParams#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.TaskIdParams#getMetadata()
	 * @see #getTaskIdParams()
	 * @generated
	 */
	EReference getTaskIdParams_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskIdParams#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.TaskIdParams#getId()
	 * @see #getTaskIdParams()
	 * @generated
	 */
	EAttribute getTaskIdParams_Id();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskNotCancelableError <em>Task Not Cancelable Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Not Cancelable Error</em>'.
	 * @see org.nasdanika.models.a2a.TaskNotCancelableError
	 * @generated
	 */
	EClass getTaskNotCancelableError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskNotCancelableError#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.models.a2a.TaskNotCancelableError#getCode()
	 * @see #getTaskNotCancelableError()
	 * @generated
	 */
	EAttribute getTaskNotCancelableError_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskNotCancelableError#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.nasdanika.models.a2a.TaskNotCancelableError#getData()
	 * @see #getTaskNotCancelableError()
	 * @generated
	 */
	EAttribute getTaskNotCancelableError_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskNotCancelableError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.a2a.TaskNotCancelableError#getMessage()
	 * @see #getTaskNotCancelableError()
	 * @generated
	 */
	EAttribute getTaskNotCancelableError_Message();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.CancelTaskRequest <em>Cancel Task Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Task Request</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskRequest
	 * @generated
	 */
	EClass getCancelTaskRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.CancelTaskRequest#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskRequest#getMethod()
	 * @see #getCancelTaskRequest()
	 * @generated
	 */
	EAttribute getCancelTaskRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.CancelTaskRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskRequest#getId()
	 * @see #getCancelTaskRequest()
	 * @generated
	 */
	EAttribute getCancelTaskRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.CancelTaskRequest#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskRequest#getJsonrpc()
	 * @see #getCancelTaskRequest()
	 * @generated
	 */
	EAttribute getCancelTaskRequest_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.CancelTaskRequest#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see org.nasdanika.models.a2a.CancelTaskRequest#getParams()
	 * @see #getCancelTaskRequest()
	 * @generated
	 */
	EReference getCancelTaskRequest_Params();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.GetTaskPushNotificationResponse <em>Get Task Push Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Task Push Notification Response</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationResponse
	 * @generated
	 */
	EClass getGetTaskPushNotificationResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.GetTaskPushNotificationResponse#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationResponse#getResult()
	 * @see #getGetTaskPushNotificationResponse()
	 * @generated
	 */
	EReference getGetTaskPushNotificationResponse_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskPushNotificationResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationResponse#getId()
	 * @see #getGetTaskPushNotificationResponse()
	 * @generated
	 */
	EAttribute getGetTaskPushNotificationResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.GetTaskPushNotificationResponse#getJsonrpc <em>Jsonrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jsonrpc</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationResponse#getJsonrpc()
	 * @see #getGetTaskPushNotificationResponse()
	 * @generated
	 */
	EAttribute getGetTaskPushNotificationResponse_Jsonrpc();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.GetTaskPushNotificationResponse#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationResponse#getError()
	 * @see #getGetTaskPushNotificationResponse()
	 * @generated
	 */
	EReference getGetTaskPushNotificationResponse_Error();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent <em>Task Artifact Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Artifact Update Event</em>'.
	 * @see org.nasdanika.models.a2a.TaskArtifactUpdateEvent
	 * @generated
	 */
	EClass getTaskArtifactUpdateEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getArtifact()
	 * @see #getTaskArtifactUpdateEvent()
	 * @generated
	 */
	EReference getTaskArtifactUpdateEvent_Artifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getMetadata()
	 * @see #getTaskArtifactUpdateEvent()
	 * @generated
	 */
	EReference getTaskArtifactUpdateEvent_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getId()
	 * @see #getTaskArtifactUpdateEvent()
	 * @generated
	 */
	EAttribute getTaskArtifactUpdateEvent_Id();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.a2a.AgentProvider <em>Agent Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Provider</em>'.
	 * @see org.nasdanika.models.a2a.AgentProvider
	 * @generated
	 */
	EClass getAgentProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentProvider#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see org.nasdanika.models.a2a.AgentProvider#getOrganization()
	 * @see #getAgentProvider()
	 * @generated
	 */
	EAttribute getAgentProvider_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.a2a.AgentProvider#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.a2a.AgentProvider#getUrl()
	 * @see #getAgentProvider()
	 * @generated
	 */
	EAttribute getAgentProvider_Url();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.a2a.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task State</em>'.
	 * @see org.nasdanika.models.a2a.TaskState
	 * @generated
	 */
	EEnum getTaskState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	A2aFactory getA2aFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__METADATA = eINSTANCE.getTask_Metadata();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SESSION_ID = eINSTANCE.getTask_SessionId();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HISTORY = eINSTANCE.getTask_History();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__STATUS = eINSTANCE.getTask_Status();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ARTIFACTS = eINSTANCE.getTask_Artifacts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.UnsupportedOperationErrorImpl <em>Unsupported Operation Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.UnsupportedOperationErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getUnsupportedOperationError()
		 * @generated
		 */
		EClass UNSUPPORTED_OPERATION_ERROR = eINSTANCE.getUnsupportedOperationError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSUPPORTED_OPERATION_ERROR__CODE = eINSTANCE.getUnsupportedOperationError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSUPPORTED_OPERATION_ERROR__DATA = eINSTANCE.getUnsupportedOperationError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSUPPORTED_OPERATION_ERROR__MESSAGE = eINSTANCE.getUnsupportedOperationError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.JSONRPCRequestImpl <em>JSONRPC Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.JSONRPCRequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONRPCRequest()
		 * @generated
		 */
		EClass JSONRPC_REQUEST = eINSTANCE.getJSONRPCRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_REQUEST__METHOD = eINSTANCE.getJSONRPCRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_REQUEST__ID = eINSTANCE.getJSONRPCRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_REQUEST__JSONRPC = eINSTANCE.getJSONRPCRequest_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSONRPC_REQUEST__PARAMS = eINSTANCE.getJSONRPCRequest_Params();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskStatusUpdateEventImpl <em>Task Status Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskStatusUpdateEventImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskStatusUpdateEvent()
		 * @generated
		 */
		EClass TASK_STATUS_UPDATE_EVENT = eINSTANCE.getTaskStatusUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_STATUS_UPDATE_EVENT__METADATA = eINSTANCE.getTaskStatusUpdateEvent_Metadata();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_STATUS_UPDATE_EVENT__FINAL = eINSTANCE.getTaskStatusUpdateEvent_Final();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_STATUS_UPDATE_EVENT__ID = eINSTANCE.getTaskStatusUpdateEvent_Id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_STATUS_UPDATE_EVENT__STATUS = eINSTANCE.getTaskStatusUpdateEvent_Status();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.AuthenticationInfoImpl <em>Authentication Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.AuthenticationInfoImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAuthenticationInfo()
		 * @generated
		 */
		EClass AUTHENTICATION_INFO = eINSTANCE.getAuthenticationInfo();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_INFO__CREDENTIALS = eINSTANCE.getAuthenticationInfo_Credentials();

		/**
		 * The meta object literal for the '<em><b>Schemes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_INFO__SCHEMES = eINSTANCE.getAuthenticationInfo_Schemes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.SendTaskStreamingResponseResultImpl <em>Send Task Streaming Response Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.SendTaskStreamingResponseResultImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskStreamingResponseResult()
		 * @generated
		 */
		EClass SEND_TASK_STREAMING_RESPONSE_RESULT = eINSTANCE.getSendTaskStreamingResponseResult();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.SendTaskStreamingResponseImpl <em>Send Task Streaming Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.SendTaskStreamingResponseImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskStreamingResponse()
		 * @generated
		 */
		EClass SEND_TASK_STREAMING_RESPONSE = eINSTANCE.getSendTaskStreamingResponse();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_TASK_STREAMING_RESPONSE__RESULT = eINSTANCE.getSendTaskStreamingResponse_Result();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_STREAMING_RESPONSE__ID = eINSTANCE.getSendTaskStreamingResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_STREAMING_RESPONSE__JSONRPC = eINSTANCE.getSendTaskStreamingResponse_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_TASK_STREAMING_RESPONSE__ERROR = eINSTANCE.getSendTaskStreamingResponse_Error();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskPushNotificationConfigImpl <em>Task Push Notification Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskPushNotificationConfigImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskPushNotificationConfig()
		 * @generated
		 */
		EClass TASK_PUSH_NOTIFICATION_CONFIG = eINSTANCE.getTaskPushNotificationConfig();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PUSH_NOTIFICATION_CONFIG__ID = eINSTANCE.getTaskPushNotificationConfig_Id();

		/**
		 * The meta object literal for the '<em><b>Push Notification Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG = eINSTANCE.getTaskPushNotificationConfig_PushNotificationConfig();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.AgentCardImpl <em>Agent Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.AgentCardImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentCard()
		 * @generated
		 */
		EClass AGENT_CARD = eINSTANCE.getAgentCard();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CARD__SKILLS = eINSTANCE.getAgentCard_Skills();

		/**
		 * The meta object literal for the '<em><b>Documentation Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CARD__DOCUMENTATION_URL = eINSTANCE.getAgentCard_DocumentationUrl();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CARD__CAPABILITIES = eINSTANCE.getAgentCard_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CARD__PROVIDER = eINSTANCE.getAgentCard_Provider();

		/**
		 * The meta object literal for the '<em><b>Default Output Modes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CARD__DEFAULT_OUTPUT_MODES = eINSTANCE.getAgentCard_DefaultOutputModes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CARD__NAME = eINSTANCE.getAgentCard_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CARD__DESCRIPTION = eINSTANCE.getAgentCard_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CARD__VERSION = eINSTANCE.getAgentCard_Version();

		/**
		 * The meta object literal for the '<em><b>Default Input Modes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CARD__DEFAULT_INPUT_MODES = eINSTANCE.getAgentCard_DefaultInputModes();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CARD__URL = eINSTANCE.getAgentCard_Url();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CARD__AUTHENTICATION = eINSTANCE.getAgentCard_Authentication();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.AgentCapabilitiesImpl <em>Agent Capabilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.AgentCapabilitiesImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentCapabilities()
		 * @generated
		 */
		EClass AGENT_CAPABILITIES = eINSTANCE.getAgentCapabilities();

		/**
		 * The meta object literal for the '<em><b>Streaming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CAPABILITIES__STREAMING = eINSTANCE.getAgentCapabilities_Streaming();

		/**
		 * The meta object literal for the '<em><b>Push Notifications</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CAPABILITIES__PUSH_NOTIFICATIONS = eINSTANCE.getAgentCapabilities_PushNotifications();

		/**
		 * The meta object literal for the '<em><b>State Transition History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY = eINSTANCE.getAgentCapabilities_StateTransitionHistory();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.SendTaskRequestImpl <em>Send Task Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.SendTaskRequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskRequest()
		 * @generated
		 */
		EClass SEND_TASK_REQUEST = eINSTANCE.getSendTaskRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_REQUEST__METHOD = eINSTANCE.getSendTaskRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_REQUEST__ID = eINSTANCE.getSendTaskRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_REQUEST__JSONRPC = eINSTANCE.getSendTaskRequest_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_TASK_REQUEST__PARAMS = eINSTANCE.getSendTaskRequest_Params();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.JSONParseErrorImpl <em>JSON Parse Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.JSONParseErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONParseError()
		 * @generated
		 */
		EClass JSON_PARSE_ERROR = eINSTANCE.getJSONParseError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_PARSE_ERROR__CODE = eINSTANCE.getJSONParseError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_PARSE_ERROR__DATA = eINSTANCE.getJSONParseError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_PARSE_ERROR__MESSAGE = eINSTANCE.getJSONParseError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.DataPartImpl <em>Data Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.DataPartImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getDataPart()
		 * @generated
		 */
		EClass DATA_PART = eINSTANCE.getDataPart();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PART__METADATA = eINSTANCE.getDataPart_Metadata();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PART__DATA = eINSTANCE.getDataPart_Data();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PART__TYPE = eINSTANCE.getDataPart_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.InvalidRequestErrorImpl <em>Invalid Request Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.InvalidRequestErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getInvalidRequestError()
		 * @generated
		 */
		EClass INVALID_REQUEST_ERROR = eINSTANCE.getInvalidRequestError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALID_REQUEST_ERROR__CODE = eINSTANCE.getInvalidRequestError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVALID_REQUEST_ERROR__DATA = eINSTANCE.getInvalidRequestError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALID_REQUEST_ERROR__MESSAGE = eINSTANCE.getInvalidRequestError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.A2ARequestImpl <em>A2A Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.A2ARequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getA2ARequest()
		 * @generated
		 */
		EClass A2A_REQUEST = eINSTANCE.getA2ARequest();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskNotFoundErrorImpl <em>Task Not Found Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskNotFoundErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskNotFoundError()
		 * @generated
		 */
		EClass TASK_NOT_FOUND_ERROR = eINSTANCE.getTaskNotFoundError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NOT_FOUND_ERROR__CODE = eINSTANCE.getTaskNotFoundError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NOT_FOUND_ERROR__DATA = eINSTANCE.getTaskNotFoundError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NOT_FOUND_ERROR__MESSAGE = eINSTANCE.getTaskNotFoundError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.JSONRPCResponseImpl <em>JSONRPC Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.JSONRPCResponseImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONRPCResponse()
		 * @generated
		 */
		EClass JSONRPC_RESPONSE = eINSTANCE.getJSONRPCResponse();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSONRPC_RESPONSE__RESULT = eINSTANCE.getJSONRPCResponse_Result();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_RESPONSE__ID = eINSTANCE.getJSONRPCResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_RESPONSE__JSONRPC = eINSTANCE.getJSONRPCResponse_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSONRPC_RESPONSE__ERROR = eINSTANCE.getJSONRPCResponse_Error();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.FilePartImpl <em>File Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.FilePartImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getFilePart()
		 * @generated
		 */
		EClass FILE_PART = eINSTANCE.getFilePart();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_PART__METADATA = eINSTANCE.getFilePart_Metadata();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_PART__FILE = eINSTANCE.getFilePart_File();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_PART__TYPE = eINSTANCE.getFilePart_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskQueryParamsImpl <em>Task Query Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskQueryParamsImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskQueryParams()
		 * @generated
		 */
		EClass TASK_QUERY_PARAMS = eINSTANCE.getTaskQueryParams();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_QUERY_PARAMS__METADATA = eINSTANCE.getTaskQueryParams_Metadata();

		/**
		 * The meta object literal for the '<em><b>History Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_QUERY_PARAMS__HISTORY_LENGTH = eINSTANCE.getTaskQueryParams_HistoryLength();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_QUERY_PARAMS__ID = eINSTANCE.getTaskQueryParams_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.PushNotificationConfigImpl <em>Push Notification Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.PushNotificationConfigImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getPushNotificationConfig()
		 * @generated
		 */
		EClass PUSH_NOTIFICATION_CONFIG = eINSTANCE.getPushNotificationConfig();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_NOTIFICATION_CONFIG__URL = eINSTANCE.getPushNotificationConfig_Url();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_NOTIFICATION_CONFIG__TOKEN = eINSTANCE.getPushNotificationConfig_Token();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_NOTIFICATION_CONFIG__AUTHENTICATION = eINSTANCE.getPushNotificationConfig_Authentication();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.PartImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.InternalErrorImpl <em>Internal Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.InternalErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getInternalError()
		 * @generated
		 */
		EClass INTERNAL_ERROR = eINSTANCE.getInternalError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ERROR__CODE = eINSTANCE.getInternalError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ERROR__DATA = eINSTANCE.getInternalError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ERROR__MESSAGE = eINSTANCE.getInternalError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.AgentAuthenticationImpl <em>Agent Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.AgentAuthenticationImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentAuthentication()
		 * @generated
		 */
		EClass AGENT_AUTHENTICATION = eINSTANCE.getAgentAuthentication();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_AUTHENTICATION__CREDENTIALS = eINSTANCE.getAgentAuthentication_Credentials();

		/**
		 * The meta object literal for the '<em><b>Schemes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_AUTHENTICATION__SCHEMES = eINSTANCE.getAgentAuthentication_Schemes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.PushNotificationNotSupportedErrorImpl <em>Push Notification Not Supported Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.PushNotificationNotSupportedErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getPushNotificationNotSupportedError()
		 * @generated
		 */
		EClass PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR = eINSTANCE.getPushNotificationNotSupportedError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__CODE = eINSTANCE.getPushNotificationNotSupportedError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__DATA = eINSTANCE.getPushNotificationNotSupportedError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__MESSAGE = eINSTANCE.getPushNotificationNotSupportedError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.GetTaskRequestImpl <em>Get Task Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.GetTaskRequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getGetTaskRequest()
		 * @generated
		 */
		EClass GET_TASK_REQUEST = eINSTANCE.getGetTaskRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_REQUEST__METHOD = eINSTANCE.getGetTaskRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_REQUEST__ID = eINSTANCE.getGetTaskRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_REQUEST__JSONRPC = eINSTANCE.getGetTaskRequest_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TASK_REQUEST__PARAMS = eINSTANCE.getGetTaskRequest_Params();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.AgentSkillImpl <em>Agent Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.AgentSkillImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentSkill()
		 * @generated
		 */
		EClass AGENT_SKILL = eINSTANCE.getAgentSkill();

		/**
		 * The meta object literal for the '<em><b>Input Modes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_SKILL__INPUT_MODES = eINSTANCE.getAgentSkill_InputModes();

		/**
		 * The meta object literal for the '<em><b>Output Modes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_SKILL__OUTPUT_MODES = eINSTANCE.getAgentSkill_OutputModes();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_SKILL__EXAMPLES = eINSTANCE.getAgentSkill_Examples();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_SKILL__NAME = eINSTANCE.getAgentSkill_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_SKILL__DESCRIPTION = eINSTANCE.getAgentSkill_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_SKILL__ID = eINSTANCE.getAgentSkill_Id();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_SKILL__TAGS = eINSTANCE.getAgentSkill_Tags();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.MessageImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__METADATA = eINSTANCE.getMessage_Metadata();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ROLE = eINSTANCE.getMessage_Role();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PARTS = eINSTANCE.getMessage_Parts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.SendTaskStreamingRequestImpl <em>Send Task Streaming Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.SendTaskStreamingRequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskStreamingRequest()
		 * @generated
		 */
		EClass SEND_TASK_STREAMING_REQUEST = eINSTANCE.getSendTaskStreamingRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_STREAMING_REQUEST__METHOD = eINSTANCE.getSendTaskStreamingRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_STREAMING_REQUEST__ID = eINSTANCE.getSendTaskStreamingRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_STREAMING_REQUEST__JSONRPC = eINSTANCE.getSendTaskStreamingRequest_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_TASK_STREAMING_REQUEST__PARAMS = eINSTANCE.getSendTaskStreamingRequest_Params();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.GetTaskPushNotificationRequestImpl <em>Get Task Push Notification Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.GetTaskPushNotificationRequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getGetTaskPushNotificationRequest()
		 * @generated
		 */
		EClass GET_TASK_PUSH_NOTIFICATION_REQUEST = eINSTANCE.getGetTaskPushNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD = eINSTANCE.getGetTaskPushNotificationRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_PUSH_NOTIFICATION_REQUEST__ID = eINSTANCE.getGetTaskPushNotificationRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC = eINSTANCE.getGetTaskPushNotificationRequest_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS = eINSTANCE.getGetTaskPushNotificationRequest_Params();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.JSONRPCErrorImpl <em>JSONRPC Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.JSONRPCErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONRPCError()
		 * @generated
		 */
		EClass JSONRPC_ERROR = eINSTANCE.getJSONRPCError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_ERROR__CODE = eINSTANCE.getJSONRPCError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSONRPC_ERROR__DATA = eINSTANCE.getJSONRPCError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_ERROR__MESSAGE = eINSTANCE.getJSONRPCError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.InvalidParamsErrorImpl <em>Invalid Params Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.InvalidParamsErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getInvalidParamsError()
		 * @generated
		 */
		EClass INVALID_PARAMS_ERROR = eINSTANCE.getInvalidParamsError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALID_PARAMS_ERROR__CODE = eINSTANCE.getInvalidParamsError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVALID_PARAMS_ERROR__DATA = eINSTANCE.getInvalidParamsError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALID_PARAMS_ERROR__MESSAGE = eINSTANCE.getInvalidParamsError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.CancelTaskResponseImpl <em>Cancel Task Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.CancelTaskResponseImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getCancelTaskResponse()
		 * @generated
		 */
		EClass CANCEL_TASK_RESPONSE = eINSTANCE.getCancelTaskResponse();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANCEL_TASK_RESPONSE__RESULT = eINSTANCE.getCancelTaskResponse_Result();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_TASK_RESPONSE__ID = eINSTANCE.getCancelTaskResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_TASK_RESPONSE__JSONRPC = eINSTANCE.getCancelTaskResponse_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANCEL_TASK_RESPONSE__ERROR = eINSTANCE.getCancelTaskResponse_Error();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.SendTaskResponseImpl <em>Send Task Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.SendTaskResponseImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSendTaskResponse()
		 * @generated
		 */
		EClass SEND_TASK_RESPONSE = eINSTANCE.getSendTaskResponse();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_TASK_RESPONSE__RESULT = eINSTANCE.getSendTaskResponse_Result();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_RESPONSE__ID = eINSTANCE.getSendTaskResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK_RESPONSE__JSONRPC = eINSTANCE.getSendTaskResponse_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_TASK_RESPONSE__ERROR = eINSTANCE.getSendTaskResponse_Error();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.SetTaskPushNotificationRequestImpl <em>Set Task Push Notification Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.SetTaskPushNotificationRequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSetTaskPushNotificationRequest()
		 * @generated
		 */
		EClass SET_TASK_PUSH_NOTIFICATION_REQUEST = eINSTANCE.getSetTaskPushNotificationRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD = eINSTANCE.getSetTaskPushNotificationRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TASK_PUSH_NOTIFICATION_REQUEST__ID = eINSTANCE.getSetTaskPushNotificationRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC = eINSTANCE.getSetTaskPushNotificationRequest_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS = eINSTANCE.getSetTaskPushNotificationRequest_Params();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TextPartImpl <em>Text Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TextPartImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTextPart()
		 * @generated
		 */
		EClass TEXT_PART = eINSTANCE.getTextPart();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_PART__METADATA = eINSTANCE.getTextPart_Metadata();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PART__TEXT = eINSTANCE.getTextPart_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_PART__TYPE = eINSTANCE.getTextPart_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.GetTaskResponseImpl <em>Get Task Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.GetTaskResponseImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getGetTaskResponse()
		 * @generated
		 */
		EClass GET_TASK_RESPONSE = eINSTANCE.getGetTaskResponse();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TASK_RESPONSE__RESULT = eINSTANCE.getGetTaskResponse_Result();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_RESPONSE__ID = eINSTANCE.getGetTaskResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_RESPONSE__JSONRPC = eINSTANCE.getGetTaskResponse_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TASK_RESPONSE__ERROR = eINSTANCE.getGetTaskResponse_Error();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskSendParamsImpl <em>Task Send Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskSendParamsImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskSendParams()
		 * @generated
		 */
		EClass TASK_SEND_PARAMS = eINSTANCE.getTaskSendParams();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SEND_PARAMS__METADATA = eINSTANCE.getTaskSendParams_Metadata();

		/**
		 * The meta object literal for the '<em><b>History Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SEND_PARAMS__HISTORY_LENGTH = eINSTANCE.getTaskSendParams_HistoryLength();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SEND_PARAMS__ID = eINSTANCE.getTaskSendParams_Id();

		/**
		 * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SEND_PARAMS__SESSION_ID = eINSTANCE.getTaskSendParams_SessionId();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SEND_PARAMS__MESSAGE = eINSTANCE.getTaskSendParams_Message();

		/**
		 * The meta object literal for the '<em><b>Push Notification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SEND_PARAMS__PUSH_NOTIFICATION = eINSTANCE.getTaskSendParams_PushNotification();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskStatusImpl <em>Task Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskStatusImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskStatus()
		 * @generated
		 */
		EClass TASK_STATUS = eINSTANCE.getTaskStatus();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_STATUS__STATE = eINSTANCE.getTaskStatus_State();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_STATUS__MESSAGE = eINSTANCE.getTaskStatus_Message();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_STATUS__TIMESTAMP = eINSTANCE.getTaskStatus_Timestamp();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.ArtifactImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__METADATA = eINSTANCE.getArtifact_Metadata();

		/**
		 * The meta object literal for the '<em><b>Last Chunk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__LAST_CHUNK = eINSTANCE.getArtifact_LastChunk();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__PARTS = eINSTANCE.getArtifact_Parts();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__DESCRIPTION = eINSTANCE.getArtifact_Description();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__INDEX = eINSTANCE.getArtifact_Index();

		/**
		 * The meta object literal for the '<em><b>Append</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__APPEND = eINSTANCE.getArtifact_Append();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.SetTaskPushNotificationResponseImpl <em>Set Task Push Notification Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.SetTaskPushNotificationResponseImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getSetTaskPushNotificationResponse()
		 * @generated
		 */
		EClass SET_TASK_PUSH_NOTIFICATION_RESPONSE = eINSTANCE.getSetTaskPushNotificationResponse();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_TASK_PUSH_NOTIFICATION_RESPONSE__RESULT = eINSTANCE.getSetTaskPushNotificationResponse_Result();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TASK_PUSH_NOTIFICATION_RESPONSE__ID = eINSTANCE.getSetTaskPushNotificationResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TASK_PUSH_NOTIFICATION_RESPONSE__JSONRPC = eINSTANCE.getSetTaskPushNotificationResponse_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_TASK_PUSH_NOTIFICATION_RESPONSE__ERROR = eINSTANCE.getSetTaskPushNotificationResponse_Error();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.FileContentImpl <em>File Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.FileContentImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getFileContent()
		 * @generated
		 */
		EClass FILE_CONTENT = eINSTANCE.getFileContent();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONTENT__BYTES = eINSTANCE.getFileContent_Bytes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONTENT__NAME = eINSTANCE.getFileContent_Name();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONTENT__MIME_TYPE = eINSTANCE.getFileContent_MimeType();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONTENT__URI = eINSTANCE.getFileContent_Uri();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.MethodNotFoundErrorImpl <em>Method Not Found Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.MethodNotFoundErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getMethodNotFoundError()
		 * @generated
		 */
		EClass METHOD_NOT_FOUND_ERROR = eINSTANCE.getMethodNotFoundError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_NOT_FOUND_ERROR__CODE = eINSTANCE.getMethodNotFoundError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_NOT_FOUND_ERROR__DATA = eINSTANCE.getMethodNotFoundError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_NOT_FOUND_ERROR__MESSAGE = eINSTANCE.getMethodNotFoundError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskResubscriptionRequestImpl <em>Task Resubscription Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskResubscriptionRequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskResubscriptionRequest()
		 * @generated
		 */
		EClass TASK_RESUBSCRIPTION_REQUEST = eINSTANCE.getTaskResubscriptionRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESUBSCRIPTION_REQUEST__METHOD = eINSTANCE.getTaskResubscriptionRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESUBSCRIPTION_REQUEST__ID = eINSTANCE.getTaskResubscriptionRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESUBSCRIPTION_REQUEST__JSONRPC = eINSTANCE.getTaskResubscriptionRequest_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_RESUBSCRIPTION_REQUEST__PARAMS = eINSTANCE.getTaskResubscriptionRequest_Params();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.JSONRPCMessageImpl <em>JSONRPC Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.JSONRPCMessageImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getJSONRPCMessage()
		 * @generated
		 */
		EClass JSONRPC_MESSAGE = eINSTANCE.getJSONRPCMessage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_MESSAGE__ID = eINSTANCE.getJSONRPCMessage_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSONRPC_MESSAGE__JSONRPC = eINSTANCE.getJSONRPCMessage_Jsonrpc();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskIdParamsImpl <em>Task Id Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskIdParamsImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskIdParams()
		 * @generated
		 */
		EClass TASK_ID_PARAMS = eINSTANCE.getTaskIdParams();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ID_PARAMS__METADATA = eINSTANCE.getTaskIdParams_Metadata();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ID_PARAMS__ID = eINSTANCE.getTaskIdParams_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskNotCancelableErrorImpl <em>Task Not Cancelable Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskNotCancelableErrorImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskNotCancelableError()
		 * @generated
		 */
		EClass TASK_NOT_CANCELABLE_ERROR = eINSTANCE.getTaskNotCancelableError();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NOT_CANCELABLE_ERROR__CODE = eINSTANCE.getTaskNotCancelableError_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NOT_CANCELABLE_ERROR__DATA = eINSTANCE.getTaskNotCancelableError_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NOT_CANCELABLE_ERROR__MESSAGE = eINSTANCE.getTaskNotCancelableError_Message();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.CancelTaskRequestImpl <em>Cancel Task Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.CancelTaskRequestImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getCancelTaskRequest()
		 * @generated
		 */
		EClass CANCEL_TASK_REQUEST = eINSTANCE.getCancelTaskRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_TASK_REQUEST__METHOD = eINSTANCE.getCancelTaskRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_TASK_REQUEST__ID = eINSTANCE.getCancelTaskRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCEL_TASK_REQUEST__JSONRPC = eINSTANCE.getCancelTaskRequest_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANCEL_TASK_REQUEST__PARAMS = eINSTANCE.getCancelTaskRequest_Params();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.GetTaskPushNotificationResponseImpl <em>Get Task Push Notification Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.GetTaskPushNotificationResponseImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getGetTaskPushNotificationResponse()
		 * @generated
		 */
		EClass GET_TASK_PUSH_NOTIFICATION_RESPONSE = eINSTANCE.getGetTaskPushNotificationResponse();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TASK_PUSH_NOTIFICATION_RESPONSE__RESULT = eINSTANCE.getGetTaskPushNotificationResponse_Result();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_PUSH_NOTIFICATION_RESPONSE__ID = eINSTANCE.getGetTaskPushNotificationResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Jsonrpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TASK_PUSH_NOTIFICATION_RESPONSE__JSONRPC = eINSTANCE.getGetTaskPushNotificationResponse_Jsonrpc();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TASK_PUSH_NOTIFICATION_RESPONSE__ERROR = eINSTANCE.getGetTaskPushNotificationResponse_Error();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.TaskArtifactUpdateEventImpl <em>Task Artifact Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.TaskArtifactUpdateEventImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskArtifactUpdateEvent()
		 * @generated
		 */
		EClass TASK_ARTIFACT_UPDATE_EVENT = eINSTANCE.getTaskArtifactUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT = eINSTANCE.getTaskArtifactUpdateEvent_Artifact();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ARTIFACT_UPDATE_EVENT__METADATA = eINSTANCE.getTaskArtifactUpdateEvent_Metadata();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ARTIFACT_UPDATE_EVENT__ID = eINSTANCE.getTaskArtifactUpdateEvent_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.impl.AgentProviderImpl <em>Agent Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.impl.AgentProviderImpl
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getAgentProvider()
		 * @generated
		 */
		EClass AGENT_PROVIDER = eINSTANCE.getAgentProvider();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_PROVIDER__ORGANIZATION = eINSTANCE.getAgentProvider_Organization();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_PROVIDER__URL = eINSTANCE.getAgentProvider_Url();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.a2a.TaskState <em>Task State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.a2a.TaskState
		 * @see org.nasdanika.models.a2a.impl.A2aPackageImpl#getTaskState()
		 * @generated
		 */
		EEnum TASK_STATE = eINSTANCE.getTaskState();

	}

} //A2aPackage
