/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.a2a.A2ARequest;
import org.nasdanika.models.a2a.A2aFactory;
import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.AgentAuthentication;
import org.nasdanika.models.a2a.AgentCapabilities;
import org.nasdanika.models.a2a.AgentCard;
import org.nasdanika.models.a2a.AgentProvider;
import org.nasdanika.models.a2a.AgentSkill;
import org.nasdanika.models.a2a.Artifact;
import org.nasdanika.models.a2a.AuthenticationInfo;
import org.nasdanika.models.a2a.CancelTaskRequest;
import org.nasdanika.models.a2a.CancelTaskResponse;
import org.nasdanika.models.a2a.DataPart;
import org.nasdanika.models.a2a.FileContent;
import org.nasdanika.models.a2a.FilePart;
import org.nasdanika.models.a2a.GetTaskPushNotificationRequest;
import org.nasdanika.models.a2a.GetTaskPushNotificationResponse;
import org.nasdanika.models.a2a.GetTaskRequest;
import org.nasdanika.models.a2a.GetTaskResponse;
import org.nasdanika.models.a2a.InvalidParamsError;
import org.nasdanika.models.a2a.InvalidRequestError;
import org.nasdanika.models.a2a.JSONParseError;
import org.nasdanika.models.a2a.JSONRPCError;
import org.nasdanika.models.a2a.JSONRPCMessage;
import org.nasdanika.models.a2a.JSONRPCRequest;
import org.nasdanika.models.a2a.JSONRPCResponse;
import org.nasdanika.models.a2a.Message;
import org.nasdanika.models.a2a.MethodNotFoundError;
import org.nasdanika.models.a2a.Part;
import org.nasdanika.models.a2a.PushNotificationConfig;
import org.nasdanika.models.a2a.PushNotificationNotSupportedError;
import org.nasdanika.models.a2a.SendTaskRequest;
import org.nasdanika.models.a2a.SendTaskResponse;
import org.nasdanika.models.a2a.SendTaskStreamingRequest;
import org.nasdanika.models.a2a.SendTaskStreamingResponse;
import org.nasdanika.models.a2a.SendTaskStreamingResponseResult;
import org.nasdanika.models.a2a.SetTaskPushNotificationRequest;
import org.nasdanika.models.a2a.SetTaskPushNotificationResponse;
import org.nasdanika.models.a2a.Task;
import org.nasdanika.models.a2a.TaskArtifactUpdateEvent;
import org.nasdanika.models.a2a.TaskIdParams;
import org.nasdanika.models.a2a.TaskNotCancelableError;
import org.nasdanika.models.a2a.TaskNotFoundError;
import org.nasdanika.models.a2a.TaskPushNotificationConfig;
import org.nasdanika.models.a2a.TaskQueryParams;
import org.nasdanika.models.a2a.TaskResubscriptionRequest;
import org.nasdanika.models.a2a.TaskSendParams;
import org.nasdanika.models.a2a.TaskState;
import org.nasdanika.models.a2a.TaskStatus;
import org.nasdanika.models.a2a.TaskStatusUpdateEvent;
import org.nasdanika.models.a2a.TextPart;
import org.nasdanika.models.a2a.UnsupportedOperationError;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A2aPackageImpl extends EPackageImpl implements A2aPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsupportedOperationErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonrpcRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskStatusUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendTaskStreamingResponseResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendTaskStreamingResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskPushNotificationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentCapabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendTaskRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonParseErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidRequestErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a2ARequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskNotFoundErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonrpcResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskQueryParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushNotificationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushNotificationNotSupportedErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTaskRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentSkillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendTaskStreamingRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTaskPushNotificationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonrpcErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidParamsErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelTaskResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendTaskResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTaskPushNotificationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTaskResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskSendParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTaskPushNotificationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodNotFoundErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskResubscriptionRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonrpcMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskIdParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskNotCancelableErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelTaskRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTaskPushNotificationResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskArtifactUpdateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.a2a.A2aPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private A2aPackageImpl() {
		super(eNS_URI, A2aFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link A2aPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static A2aPackage init() {
		if (isInited) return (A2aPackage)EPackage.Registry.INSTANCE.getEPackage(A2aPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredA2aPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		A2aPackageImpl theA2aPackage = registeredA2aPackage instanceof A2aPackageImpl ? (A2aPackageImpl)registeredA2aPackage : new A2aPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theA2aPackage.createPackageContents();

		// Initialize created meta-data
		theA2aPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theA2aPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(A2aPackage.eNS_URI, theA2aPackage);
		return theA2aPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Metadata() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_SessionId() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_History() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Status() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Artifacts() {
		return (EReference)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsupportedOperationError() {
		return unsupportedOperationErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnsupportedOperationError_Code() {
		return (EAttribute)unsupportedOperationErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnsupportedOperationError_Data() {
		return (EAttribute)unsupportedOperationErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnsupportedOperationError_Message() {
		return (EAttribute)unsupportedOperationErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSONRPCRequest() {
		return jsonrpcRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCRequest_Method() {
		return (EAttribute)jsonrpcRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCRequest_Id() {
		return (EAttribute)jsonrpcRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCRequest_Jsonrpc() {
		return (EAttribute)jsonrpcRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJSONRPCRequest_Params() {
		return (EReference)jsonrpcRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskStatusUpdateEvent() {
		return taskStatusUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskStatusUpdateEvent_Metadata() {
		return (EReference)taskStatusUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskStatusUpdateEvent_Final() {
		return (EAttribute)taskStatusUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskStatusUpdateEvent_Id() {
		return (EAttribute)taskStatusUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskStatusUpdateEvent_Status() {
		return (EReference)taskStatusUpdateEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationInfo() {
		return authenticationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationInfo_Credentials() {
		return (EAttribute)authenticationInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationInfo_Schemes() {
		return (EAttribute)authenticationInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendTaskStreamingResponseResult() {
		return sendTaskStreamingResponseResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendTaskStreamingResponse() {
		return sendTaskStreamingResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendTaskStreamingResponse_Result() {
		return (EReference)sendTaskStreamingResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskStreamingResponse_Id() {
		return (EAttribute)sendTaskStreamingResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskStreamingResponse_Jsonrpc() {
		return (EAttribute)sendTaskStreamingResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendTaskStreamingResponse_Error() {
		return (EReference)sendTaskStreamingResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskPushNotificationConfig() {
		return taskPushNotificationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskPushNotificationConfig_Id() {
		return (EAttribute)taskPushNotificationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskPushNotificationConfig_PushNotificationConfig() {
		return (EReference)taskPushNotificationConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentCard() {
		return agentCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentCard_Skills() {
		return (EReference)agentCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCard_DocumentationUrl() {
		return (EAttribute)agentCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentCard_Capabilities() {
		return (EReference)agentCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentCard_Provider() {
		return (EReference)agentCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCard_DefaultOutputModes() {
		return (EAttribute)agentCardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCard_Name() {
		return (EAttribute)agentCardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCard_Description() {
		return (EAttribute)agentCardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCard_Version() {
		return (EAttribute)agentCardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCard_DefaultInputModes() {
		return (EAttribute)agentCardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCard_Url() {
		return (EAttribute)agentCardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentCard_Authentication() {
		return (EReference)agentCardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentCapabilities() {
		return agentCapabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCapabilities_Streaming() {
		return (EAttribute)agentCapabilitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCapabilities_PushNotifications() {
		return (EAttribute)agentCapabilitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentCapabilities_StateTransitionHistory() {
		return (EAttribute)agentCapabilitiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendTaskRequest() {
		return sendTaskRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskRequest_Method() {
		return (EAttribute)sendTaskRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskRequest_Id() {
		return (EAttribute)sendTaskRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskRequest_Jsonrpc() {
		return (EAttribute)sendTaskRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendTaskRequest_Params() {
		return (EReference)sendTaskRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSONParseError() {
		return jsonParseErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONParseError_Code() {
		return (EAttribute)jsonParseErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJSONParseError_Data() {
		return (EReference)jsonParseErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONParseError_Message() {
		return (EAttribute)jsonParseErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataPart() {
		return dataPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataPart_Metadata() {
		return (EReference)dataPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataPart_Data() {
		return (EReference)dataPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataPart_Type() {
		return (EAttribute)dataPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvalidRequestError() {
		return invalidRequestErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvalidRequestError_Code() {
		return (EAttribute)invalidRequestErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvalidRequestError_Data() {
		return (EReference)invalidRequestErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvalidRequestError_Message() {
		return (EAttribute)invalidRequestErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getA2ARequest() {
		return a2ARequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskNotFoundError() {
		return taskNotFoundErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskNotFoundError_Code() {
		return (EAttribute)taskNotFoundErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskNotFoundError_Data() {
		return (EAttribute)taskNotFoundErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskNotFoundError_Message() {
		return (EAttribute)taskNotFoundErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSONRPCResponse() {
		return jsonrpcResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJSONRPCResponse_Result() {
		return (EReference)jsonrpcResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCResponse_Id() {
		return (EAttribute)jsonrpcResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCResponse_Jsonrpc() {
		return (EAttribute)jsonrpcResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJSONRPCResponse_Error() {
		return (EReference)jsonrpcResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilePart() {
		return filePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilePart_Metadata() {
		return (EReference)filePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilePart_File() {
		return (EReference)filePartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilePart_Type() {
		return (EAttribute)filePartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskQueryParams() {
		return taskQueryParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskQueryParams_Metadata() {
		return (EReference)taskQueryParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskQueryParams_HistoryLength() {
		return (EAttribute)taskQueryParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskQueryParams_Id() {
		return (EAttribute)taskQueryParamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPushNotificationConfig() {
		return pushNotificationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPushNotificationConfig_Url() {
		return (EAttribute)pushNotificationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPushNotificationConfig_Token() {
		return (EAttribute)pushNotificationConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPushNotificationConfig_Authentication() {
		return (EReference)pushNotificationConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalError() {
		return internalErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalError_Code() {
		return (EAttribute)internalErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalError_Data() {
		return (EReference)internalErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalError_Message() {
		return (EAttribute)internalErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentAuthentication() {
		return agentAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentAuthentication_Credentials() {
		return (EAttribute)agentAuthenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentAuthentication_Schemes() {
		return (EAttribute)agentAuthenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPushNotificationNotSupportedError() {
		return pushNotificationNotSupportedErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPushNotificationNotSupportedError_Code() {
		return (EAttribute)pushNotificationNotSupportedErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPushNotificationNotSupportedError_Data() {
		return (EAttribute)pushNotificationNotSupportedErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPushNotificationNotSupportedError_Message() {
		return (EAttribute)pushNotificationNotSupportedErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTaskRequest() {
		return getTaskRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskRequest_Method() {
		return (EAttribute)getTaskRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskRequest_Id() {
		return (EAttribute)getTaskRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskRequest_Jsonrpc() {
		return (EAttribute)getTaskRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetTaskRequest_Params() {
		return (EReference)getTaskRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentSkill() {
		return agentSkillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentSkill_InputModes() {
		return (EAttribute)agentSkillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentSkill_OutputModes() {
		return (EAttribute)agentSkillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentSkill_Examples() {
		return (EAttribute)agentSkillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentSkill_Name() {
		return (EAttribute)agentSkillEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentSkill_Description() {
		return (EAttribute)agentSkillEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentSkill_Id() {
		return (EAttribute)agentSkillEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentSkill_Tags() {
		return (EAttribute)agentSkillEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Metadata() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Role() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_Parts() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendTaskStreamingRequest() {
		return sendTaskStreamingRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskStreamingRequest_Method() {
		return (EAttribute)sendTaskStreamingRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskStreamingRequest_Id() {
		return (EAttribute)sendTaskStreamingRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskStreamingRequest_Jsonrpc() {
		return (EAttribute)sendTaskStreamingRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendTaskStreamingRequest_Params() {
		return (EReference)sendTaskStreamingRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTaskPushNotificationRequest() {
		return getTaskPushNotificationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskPushNotificationRequest_Method() {
		return (EAttribute)getTaskPushNotificationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskPushNotificationRequest_Id() {
		return (EAttribute)getTaskPushNotificationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskPushNotificationRequest_Jsonrpc() {
		return (EAttribute)getTaskPushNotificationRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetTaskPushNotificationRequest_Params() {
		return (EReference)getTaskPushNotificationRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSONRPCError() {
		return jsonrpcErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCError_Code() {
		return (EAttribute)jsonrpcErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJSONRPCError_Data() {
		return (EReference)jsonrpcErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCError_Message() {
		return (EAttribute)jsonrpcErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvalidParamsError() {
		return invalidParamsErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvalidParamsError_Code() {
		return (EAttribute)invalidParamsErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvalidParamsError_Data() {
		return (EReference)invalidParamsErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvalidParamsError_Message() {
		return (EAttribute)invalidParamsErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCancelTaskResponse() {
		return cancelTaskResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCancelTaskResponse_Result() {
		return (EReference)cancelTaskResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancelTaskResponse_Id() {
		return (EAttribute)cancelTaskResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancelTaskResponse_Jsonrpc() {
		return (EAttribute)cancelTaskResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCancelTaskResponse_Error() {
		return (EReference)cancelTaskResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendTaskResponse() {
		return sendTaskResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendTaskResponse_Result() {
		return (EReference)sendTaskResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskResponse_Id() {
		return (EAttribute)sendTaskResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSendTaskResponse_Jsonrpc() {
		return (EAttribute)sendTaskResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendTaskResponse_Error() {
		return (EReference)sendTaskResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetTaskPushNotificationRequest() {
		return setTaskPushNotificationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetTaskPushNotificationRequest_Method() {
		return (EAttribute)setTaskPushNotificationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetTaskPushNotificationRequest_Id() {
		return (EAttribute)setTaskPushNotificationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetTaskPushNotificationRequest_Jsonrpc() {
		return (EAttribute)setTaskPushNotificationRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetTaskPushNotificationRequest_Params() {
		return (EReference)setTaskPushNotificationRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextPart() {
		return textPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextPart_Metadata() {
		return (EReference)textPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextPart_Text() {
		return (EAttribute)textPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextPart_Type() {
		return (EAttribute)textPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTaskResponse() {
		return getTaskResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetTaskResponse_Result() {
		return (EReference)getTaskResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskResponse_Id() {
		return (EAttribute)getTaskResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskResponse_Jsonrpc() {
		return (EAttribute)getTaskResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetTaskResponse_Error() {
		return (EReference)getTaskResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskSendParams() {
		return taskSendParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskSendParams_Metadata() {
		return (EReference)taskSendParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskSendParams_HistoryLength() {
		return (EAttribute)taskSendParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskSendParams_Id() {
		return (EAttribute)taskSendParamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskSendParams_SessionId() {
		return (EAttribute)taskSendParamsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskSendParams_Message() {
		return (EReference)taskSendParamsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskSendParams_PushNotification() {
		return (EReference)taskSendParamsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskStatus() {
		return taskStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskStatus_State() {
		return (EAttribute)taskStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskStatus_Message() {
		return (EReference)taskStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskStatus_Timestamp() {
		return (EAttribute)taskStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Metadata() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_LastChunk() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Name() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Parts() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Description() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Index() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Append() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetTaskPushNotificationResponse() {
		return setTaskPushNotificationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetTaskPushNotificationResponse_Result() {
		return (EReference)setTaskPushNotificationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetTaskPushNotificationResponse_Id() {
		return (EAttribute)setTaskPushNotificationResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetTaskPushNotificationResponse_Jsonrpc() {
		return (EAttribute)setTaskPushNotificationResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetTaskPushNotificationResponse_Error() {
		return (EReference)setTaskPushNotificationResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileContent() {
		return fileContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileContent_Bytes() {
		return (EAttribute)fileContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileContent_Name() {
		return (EAttribute)fileContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileContent_MimeType() {
		return (EAttribute)fileContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileContent_Uri() {
		return (EAttribute)fileContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodNotFoundError() {
		return methodNotFoundErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodNotFoundError_Code() {
		return (EAttribute)methodNotFoundErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodNotFoundError_Data() {
		return (EAttribute)methodNotFoundErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodNotFoundError_Message() {
		return (EAttribute)methodNotFoundErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskResubscriptionRequest() {
		return taskResubscriptionRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskResubscriptionRequest_Method() {
		return (EAttribute)taskResubscriptionRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskResubscriptionRequest_Id() {
		return (EAttribute)taskResubscriptionRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskResubscriptionRequest_Jsonrpc() {
		return (EAttribute)taskResubscriptionRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskResubscriptionRequest_Params() {
		return (EReference)taskResubscriptionRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSONRPCMessage() {
		return jsonrpcMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCMessage_Id() {
		return (EAttribute)jsonrpcMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONRPCMessage_Jsonrpc() {
		return (EAttribute)jsonrpcMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskIdParams() {
		return taskIdParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskIdParams_Metadata() {
		return (EReference)taskIdParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskIdParams_Id() {
		return (EAttribute)taskIdParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskNotCancelableError() {
		return taskNotCancelableErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskNotCancelableError_Code() {
		return (EAttribute)taskNotCancelableErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskNotCancelableError_Data() {
		return (EAttribute)taskNotCancelableErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskNotCancelableError_Message() {
		return (EAttribute)taskNotCancelableErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCancelTaskRequest() {
		return cancelTaskRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancelTaskRequest_Method() {
		return (EAttribute)cancelTaskRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancelTaskRequest_Id() {
		return (EAttribute)cancelTaskRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCancelTaskRequest_Jsonrpc() {
		return (EAttribute)cancelTaskRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCancelTaskRequest_Params() {
		return (EReference)cancelTaskRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetTaskPushNotificationResponse() {
		return getTaskPushNotificationResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetTaskPushNotificationResponse_Result() {
		return (EReference)getTaskPushNotificationResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskPushNotificationResponse_Id() {
		return (EAttribute)getTaskPushNotificationResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetTaskPushNotificationResponse_Jsonrpc() {
		return (EAttribute)getTaskPushNotificationResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGetTaskPushNotificationResponse_Error() {
		return (EReference)getTaskPushNotificationResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskArtifactUpdateEvent() {
		return taskArtifactUpdateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskArtifactUpdateEvent_Artifact() {
		return (EReference)taskArtifactUpdateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskArtifactUpdateEvent_Metadata() {
		return (EReference)taskArtifactUpdateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskArtifactUpdateEvent_Id() {
		return (EAttribute)taskArtifactUpdateEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentProvider() {
		return agentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentProvider_Organization() {
		return (EAttribute)agentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgentProvider_Url() {
		return (EAttribute)agentProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTaskState() {
		return taskStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A2aFactory getA2aFactory() {
		return (A2aFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__METADATA);
		createEAttribute(taskEClass, TASK__ID);
		createEAttribute(taskEClass, TASK__SESSION_ID);
		createEReference(taskEClass, TASK__HISTORY);
		createEReference(taskEClass, TASK__STATUS);
		createEReference(taskEClass, TASK__ARTIFACTS);

		unsupportedOperationErrorEClass = createEClass(UNSUPPORTED_OPERATION_ERROR);
		createEAttribute(unsupportedOperationErrorEClass, UNSUPPORTED_OPERATION_ERROR__CODE);
		createEAttribute(unsupportedOperationErrorEClass, UNSUPPORTED_OPERATION_ERROR__DATA);
		createEAttribute(unsupportedOperationErrorEClass, UNSUPPORTED_OPERATION_ERROR__MESSAGE);

		jsonrpcRequestEClass = createEClass(JSONRPC_REQUEST);
		createEAttribute(jsonrpcRequestEClass, JSONRPC_REQUEST__METHOD);
		createEAttribute(jsonrpcRequestEClass, JSONRPC_REQUEST__ID);
		createEAttribute(jsonrpcRequestEClass, JSONRPC_REQUEST__JSONRPC);
		createEReference(jsonrpcRequestEClass, JSONRPC_REQUEST__PARAMS);

		taskStatusUpdateEventEClass = createEClass(TASK_STATUS_UPDATE_EVENT);
		createEReference(taskStatusUpdateEventEClass, TASK_STATUS_UPDATE_EVENT__METADATA);
		createEAttribute(taskStatusUpdateEventEClass, TASK_STATUS_UPDATE_EVENT__FINAL);
		createEAttribute(taskStatusUpdateEventEClass, TASK_STATUS_UPDATE_EVENT__ID);
		createEReference(taskStatusUpdateEventEClass, TASK_STATUS_UPDATE_EVENT__STATUS);

		authenticationInfoEClass = createEClass(AUTHENTICATION_INFO);
		createEAttribute(authenticationInfoEClass, AUTHENTICATION_INFO__CREDENTIALS);
		createEAttribute(authenticationInfoEClass, AUTHENTICATION_INFO__SCHEMES);

		sendTaskStreamingResponseResultEClass = createEClass(SEND_TASK_STREAMING_RESPONSE_RESULT);

		sendTaskStreamingResponseEClass = createEClass(SEND_TASK_STREAMING_RESPONSE);
		createEReference(sendTaskStreamingResponseEClass, SEND_TASK_STREAMING_RESPONSE__RESULT);
		createEAttribute(sendTaskStreamingResponseEClass, SEND_TASK_STREAMING_RESPONSE__ID);
		createEAttribute(sendTaskStreamingResponseEClass, SEND_TASK_STREAMING_RESPONSE__JSONRPC);
		createEReference(sendTaskStreamingResponseEClass, SEND_TASK_STREAMING_RESPONSE__ERROR);

		taskPushNotificationConfigEClass = createEClass(TASK_PUSH_NOTIFICATION_CONFIG);
		createEAttribute(taskPushNotificationConfigEClass, TASK_PUSH_NOTIFICATION_CONFIG__ID);
		createEReference(taskPushNotificationConfigEClass, TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG);

		agentCardEClass = createEClass(AGENT_CARD);
		createEReference(agentCardEClass, AGENT_CARD__SKILLS);
		createEAttribute(agentCardEClass, AGENT_CARD__DOCUMENTATION_URL);
		createEReference(agentCardEClass, AGENT_CARD__CAPABILITIES);
		createEReference(agentCardEClass, AGENT_CARD__PROVIDER);
		createEAttribute(agentCardEClass, AGENT_CARD__DEFAULT_OUTPUT_MODES);
		createEAttribute(agentCardEClass, AGENT_CARD__NAME);
		createEAttribute(agentCardEClass, AGENT_CARD__DESCRIPTION);
		createEAttribute(agentCardEClass, AGENT_CARD__VERSION);
		createEAttribute(agentCardEClass, AGENT_CARD__DEFAULT_INPUT_MODES);
		createEAttribute(agentCardEClass, AGENT_CARD__URL);
		createEReference(agentCardEClass, AGENT_CARD__AUTHENTICATION);

		agentCapabilitiesEClass = createEClass(AGENT_CAPABILITIES);
		createEAttribute(agentCapabilitiesEClass, AGENT_CAPABILITIES__STREAMING);
		createEAttribute(agentCapabilitiesEClass, AGENT_CAPABILITIES__PUSH_NOTIFICATIONS);
		createEAttribute(agentCapabilitiesEClass, AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY);

		sendTaskRequestEClass = createEClass(SEND_TASK_REQUEST);
		createEAttribute(sendTaskRequestEClass, SEND_TASK_REQUEST__METHOD);
		createEAttribute(sendTaskRequestEClass, SEND_TASK_REQUEST__ID);
		createEAttribute(sendTaskRequestEClass, SEND_TASK_REQUEST__JSONRPC);
		createEReference(sendTaskRequestEClass, SEND_TASK_REQUEST__PARAMS);

		jsonParseErrorEClass = createEClass(JSON_PARSE_ERROR);
		createEAttribute(jsonParseErrorEClass, JSON_PARSE_ERROR__CODE);
		createEReference(jsonParseErrorEClass, JSON_PARSE_ERROR__DATA);
		createEAttribute(jsonParseErrorEClass, JSON_PARSE_ERROR__MESSAGE);

		dataPartEClass = createEClass(DATA_PART);
		createEReference(dataPartEClass, DATA_PART__METADATA);
		createEReference(dataPartEClass, DATA_PART__DATA);
		createEAttribute(dataPartEClass, DATA_PART__TYPE);

		invalidRequestErrorEClass = createEClass(INVALID_REQUEST_ERROR);
		createEAttribute(invalidRequestErrorEClass, INVALID_REQUEST_ERROR__CODE);
		createEReference(invalidRequestErrorEClass, INVALID_REQUEST_ERROR__DATA);
		createEAttribute(invalidRequestErrorEClass, INVALID_REQUEST_ERROR__MESSAGE);

		a2ARequestEClass = createEClass(A2A_REQUEST);

		taskNotFoundErrorEClass = createEClass(TASK_NOT_FOUND_ERROR);
		createEAttribute(taskNotFoundErrorEClass, TASK_NOT_FOUND_ERROR__CODE);
		createEAttribute(taskNotFoundErrorEClass, TASK_NOT_FOUND_ERROR__DATA);
		createEAttribute(taskNotFoundErrorEClass, TASK_NOT_FOUND_ERROR__MESSAGE);

		jsonrpcResponseEClass = createEClass(JSONRPC_RESPONSE);
		createEReference(jsonrpcResponseEClass, JSONRPC_RESPONSE__RESULT);
		createEAttribute(jsonrpcResponseEClass, JSONRPC_RESPONSE__ID);
		createEAttribute(jsonrpcResponseEClass, JSONRPC_RESPONSE__JSONRPC);
		createEReference(jsonrpcResponseEClass, JSONRPC_RESPONSE__ERROR);

		filePartEClass = createEClass(FILE_PART);
		createEReference(filePartEClass, FILE_PART__METADATA);
		createEReference(filePartEClass, FILE_PART__FILE);
		createEAttribute(filePartEClass, FILE_PART__TYPE);

		taskQueryParamsEClass = createEClass(TASK_QUERY_PARAMS);
		createEReference(taskQueryParamsEClass, TASK_QUERY_PARAMS__METADATA);
		createEAttribute(taskQueryParamsEClass, TASK_QUERY_PARAMS__HISTORY_LENGTH);
		createEAttribute(taskQueryParamsEClass, TASK_QUERY_PARAMS__ID);

		pushNotificationConfigEClass = createEClass(PUSH_NOTIFICATION_CONFIG);
		createEAttribute(pushNotificationConfigEClass, PUSH_NOTIFICATION_CONFIG__URL);
		createEAttribute(pushNotificationConfigEClass, PUSH_NOTIFICATION_CONFIG__TOKEN);
		createEReference(pushNotificationConfigEClass, PUSH_NOTIFICATION_CONFIG__AUTHENTICATION);

		partEClass = createEClass(PART);

		internalErrorEClass = createEClass(INTERNAL_ERROR);
		createEAttribute(internalErrorEClass, INTERNAL_ERROR__CODE);
		createEReference(internalErrorEClass, INTERNAL_ERROR__DATA);
		createEAttribute(internalErrorEClass, INTERNAL_ERROR__MESSAGE);

		agentAuthenticationEClass = createEClass(AGENT_AUTHENTICATION);
		createEAttribute(agentAuthenticationEClass, AGENT_AUTHENTICATION__CREDENTIALS);
		createEAttribute(agentAuthenticationEClass, AGENT_AUTHENTICATION__SCHEMES);

		pushNotificationNotSupportedErrorEClass = createEClass(PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR);
		createEAttribute(pushNotificationNotSupportedErrorEClass, PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__CODE);
		createEAttribute(pushNotificationNotSupportedErrorEClass, PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__DATA);
		createEAttribute(pushNotificationNotSupportedErrorEClass, PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR__MESSAGE);

		getTaskRequestEClass = createEClass(GET_TASK_REQUEST);
		createEAttribute(getTaskRequestEClass, GET_TASK_REQUEST__METHOD);
		createEAttribute(getTaskRequestEClass, GET_TASK_REQUEST__ID);
		createEAttribute(getTaskRequestEClass, GET_TASK_REQUEST__JSONRPC);
		createEReference(getTaskRequestEClass, GET_TASK_REQUEST__PARAMS);

		agentSkillEClass = createEClass(AGENT_SKILL);
		createEAttribute(agentSkillEClass, AGENT_SKILL__INPUT_MODES);
		createEAttribute(agentSkillEClass, AGENT_SKILL__OUTPUT_MODES);
		createEAttribute(agentSkillEClass, AGENT_SKILL__EXAMPLES);
		createEAttribute(agentSkillEClass, AGENT_SKILL__NAME);
		createEAttribute(agentSkillEClass, AGENT_SKILL__DESCRIPTION);
		createEAttribute(agentSkillEClass, AGENT_SKILL__ID);
		createEAttribute(agentSkillEClass, AGENT_SKILL__TAGS);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__METADATA);
		createEAttribute(messageEClass, MESSAGE__ROLE);
		createEReference(messageEClass, MESSAGE__PARTS);

		sendTaskStreamingRequestEClass = createEClass(SEND_TASK_STREAMING_REQUEST);
		createEAttribute(sendTaskStreamingRequestEClass, SEND_TASK_STREAMING_REQUEST__METHOD);
		createEAttribute(sendTaskStreamingRequestEClass, SEND_TASK_STREAMING_REQUEST__ID);
		createEAttribute(sendTaskStreamingRequestEClass, SEND_TASK_STREAMING_REQUEST__JSONRPC);
		createEReference(sendTaskStreamingRequestEClass, SEND_TASK_STREAMING_REQUEST__PARAMS);

		getTaskPushNotificationRequestEClass = createEClass(GET_TASK_PUSH_NOTIFICATION_REQUEST);
		createEAttribute(getTaskPushNotificationRequestEClass, GET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD);
		createEAttribute(getTaskPushNotificationRequestEClass, GET_TASK_PUSH_NOTIFICATION_REQUEST__ID);
		createEAttribute(getTaskPushNotificationRequestEClass, GET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC);
		createEReference(getTaskPushNotificationRequestEClass, GET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS);

		jsonrpcErrorEClass = createEClass(JSONRPC_ERROR);
		createEAttribute(jsonrpcErrorEClass, JSONRPC_ERROR__CODE);
		createEReference(jsonrpcErrorEClass, JSONRPC_ERROR__DATA);
		createEAttribute(jsonrpcErrorEClass, JSONRPC_ERROR__MESSAGE);

		invalidParamsErrorEClass = createEClass(INVALID_PARAMS_ERROR);
		createEAttribute(invalidParamsErrorEClass, INVALID_PARAMS_ERROR__CODE);
		createEReference(invalidParamsErrorEClass, INVALID_PARAMS_ERROR__DATA);
		createEAttribute(invalidParamsErrorEClass, INVALID_PARAMS_ERROR__MESSAGE);

		cancelTaskResponseEClass = createEClass(CANCEL_TASK_RESPONSE);
		createEReference(cancelTaskResponseEClass, CANCEL_TASK_RESPONSE__RESULT);
		createEAttribute(cancelTaskResponseEClass, CANCEL_TASK_RESPONSE__ID);
		createEAttribute(cancelTaskResponseEClass, CANCEL_TASK_RESPONSE__JSONRPC);
		createEReference(cancelTaskResponseEClass, CANCEL_TASK_RESPONSE__ERROR);

		sendTaskResponseEClass = createEClass(SEND_TASK_RESPONSE);
		createEReference(sendTaskResponseEClass, SEND_TASK_RESPONSE__RESULT);
		createEAttribute(sendTaskResponseEClass, SEND_TASK_RESPONSE__ID);
		createEAttribute(sendTaskResponseEClass, SEND_TASK_RESPONSE__JSONRPC);
		createEReference(sendTaskResponseEClass, SEND_TASK_RESPONSE__ERROR);

		setTaskPushNotificationRequestEClass = createEClass(SET_TASK_PUSH_NOTIFICATION_REQUEST);
		createEAttribute(setTaskPushNotificationRequestEClass, SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD);
		createEAttribute(setTaskPushNotificationRequestEClass, SET_TASK_PUSH_NOTIFICATION_REQUEST__ID);
		createEAttribute(setTaskPushNotificationRequestEClass, SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC);
		createEReference(setTaskPushNotificationRequestEClass, SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS);

		textPartEClass = createEClass(TEXT_PART);
		createEReference(textPartEClass, TEXT_PART__METADATA);
		createEAttribute(textPartEClass, TEXT_PART__TEXT);
		createEAttribute(textPartEClass, TEXT_PART__TYPE);

		getTaskResponseEClass = createEClass(GET_TASK_RESPONSE);
		createEReference(getTaskResponseEClass, GET_TASK_RESPONSE__RESULT);
		createEAttribute(getTaskResponseEClass, GET_TASK_RESPONSE__ID);
		createEAttribute(getTaskResponseEClass, GET_TASK_RESPONSE__JSONRPC);
		createEReference(getTaskResponseEClass, GET_TASK_RESPONSE__ERROR);

		taskSendParamsEClass = createEClass(TASK_SEND_PARAMS);
		createEReference(taskSendParamsEClass, TASK_SEND_PARAMS__METADATA);
		createEAttribute(taskSendParamsEClass, TASK_SEND_PARAMS__HISTORY_LENGTH);
		createEAttribute(taskSendParamsEClass, TASK_SEND_PARAMS__ID);
		createEAttribute(taskSendParamsEClass, TASK_SEND_PARAMS__SESSION_ID);
		createEReference(taskSendParamsEClass, TASK_SEND_PARAMS__MESSAGE);
		createEReference(taskSendParamsEClass, TASK_SEND_PARAMS__PUSH_NOTIFICATION);

		taskStatusEClass = createEClass(TASK_STATUS);
		createEAttribute(taskStatusEClass, TASK_STATUS__STATE);
		createEReference(taskStatusEClass, TASK_STATUS__MESSAGE);
		createEAttribute(taskStatusEClass, TASK_STATUS__TIMESTAMP);

		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__METADATA);
		createEAttribute(artifactEClass, ARTIFACT__LAST_CHUNK);
		createEAttribute(artifactEClass, ARTIFACT__NAME);
		createEReference(artifactEClass, ARTIFACT__PARTS);
		createEAttribute(artifactEClass, ARTIFACT__DESCRIPTION);
		createEAttribute(artifactEClass, ARTIFACT__INDEX);
		createEAttribute(artifactEClass, ARTIFACT__APPEND);

		setTaskPushNotificationResponseEClass = createEClass(SET_TASK_PUSH_NOTIFICATION_RESPONSE);
		createEReference(setTaskPushNotificationResponseEClass, SET_TASK_PUSH_NOTIFICATION_RESPONSE__RESULT);
		createEAttribute(setTaskPushNotificationResponseEClass, SET_TASK_PUSH_NOTIFICATION_RESPONSE__ID);
		createEAttribute(setTaskPushNotificationResponseEClass, SET_TASK_PUSH_NOTIFICATION_RESPONSE__JSONRPC);
		createEReference(setTaskPushNotificationResponseEClass, SET_TASK_PUSH_NOTIFICATION_RESPONSE__ERROR);

		fileContentEClass = createEClass(FILE_CONTENT);
		createEAttribute(fileContentEClass, FILE_CONTENT__BYTES);
		createEAttribute(fileContentEClass, FILE_CONTENT__NAME);
		createEAttribute(fileContentEClass, FILE_CONTENT__MIME_TYPE);
		createEAttribute(fileContentEClass, FILE_CONTENT__URI);

		methodNotFoundErrorEClass = createEClass(METHOD_NOT_FOUND_ERROR);
		createEAttribute(methodNotFoundErrorEClass, METHOD_NOT_FOUND_ERROR__CODE);
		createEAttribute(methodNotFoundErrorEClass, METHOD_NOT_FOUND_ERROR__DATA);
		createEAttribute(methodNotFoundErrorEClass, METHOD_NOT_FOUND_ERROR__MESSAGE);

		taskResubscriptionRequestEClass = createEClass(TASK_RESUBSCRIPTION_REQUEST);
		createEAttribute(taskResubscriptionRequestEClass, TASK_RESUBSCRIPTION_REQUEST__METHOD);
		createEAttribute(taskResubscriptionRequestEClass, TASK_RESUBSCRIPTION_REQUEST__ID);
		createEAttribute(taskResubscriptionRequestEClass, TASK_RESUBSCRIPTION_REQUEST__JSONRPC);
		createEReference(taskResubscriptionRequestEClass, TASK_RESUBSCRIPTION_REQUEST__PARAMS);

		jsonrpcMessageEClass = createEClass(JSONRPC_MESSAGE);
		createEAttribute(jsonrpcMessageEClass, JSONRPC_MESSAGE__ID);
		createEAttribute(jsonrpcMessageEClass, JSONRPC_MESSAGE__JSONRPC);

		taskIdParamsEClass = createEClass(TASK_ID_PARAMS);
		createEReference(taskIdParamsEClass, TASK_ID_PARAMS__METADATA);
		createEAttribute(taskIdParamsEClass, TASK_ID_PARAMS__ID);

		taskNotCancelableErrorEClass = createEClass(TASK_NOT_CANCELABLE_ERROR);
		createEAttribute(taskNotCancelableErrorEClass, TASK_NOT_CANCELABLE_ERROR__CODE);
		createEAttribute(taskNotCancelableErrorEClass, TASK_NOT_CANCELABLE_ERROR__DATA);
		createEAttribute(taskNotCancelableErrorEClass, TASK_NOT_CANCELABLE_ERROR__MESSAGE);

		cancelTaskRequestEClass = createEClass(CANCEL_TASK_REQUEST);
		createEAttribute(cancelTaskRequestEClass, CANCEL_TASK_REQUEST__METHOD);
		createEAttribute(cancelTaskRequestEClass, CANCEL_TASK_REQUEST__ID);
		createEAttribute(cancelTaskRequestEClass, CANCEL_TASK_REQUEST__JSONRPC);
		createEReference(cancelTaskRequestEClass, CANCEL_TASK_REQUEST__PARAMS);

		getTaskPushNotificationResponseEClass = createEClass(GET_TASK_PUSH_NOTIFICATION_RESPONSE);
		createEReference(getTaskPushNotificationResponseEClass, GET_TASK_PUSH_NOTIFICATION_RESPONSE__RESULT);
		createEAttribute(getTaskPushNotificationResponseEClass, GET_TASK_PUSH_NOTIFICATION_RESPONSE__ID);
		createEAttribute(getTaskPushNotificationResponseEClass, GET_TASK_PUSH_NOTIFICATION_RESPONSE__JSONRPC);
		createEReference(getTaskPushNotificationResponseEClass, GET_TASK_PUSH_NOTIFICATION_RESPONSE__ERROR);

		taskArtifactUpdateEventEClass = createEClass(TASK_ARTIFACT_UPDATE_EVENT);
		createEReference(taskArtifactUpdateEventEClass, TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT);
		createEReference(taskArtifactUpdateEventEClass, TASK_ARTIFACT_UPDATE_EVENT__METADATA);
		createEAttribute(taskArtifactUpdateEventEClass, TASK_ARTIFACT_UPDATE_EVENT__ID);

		agentProviderEClass = createEClass(AGENT_PROVIDER);
		createEAttribute(agentProviderEClass, AGENT_PROVIDER__ORGANIZATION);
		createEAttribute(agentProviderEClass, AGENT_PROVIDER__URL);

		// Create enums
		taskStateEEnum = createEEnum(TASK_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskStatusUpdateEventEClass.getESuperTypes().add(this.getSendTaskStreamingResponseResult());
		sendTaskRequestEClass.getESuperTypes().add(this.getA2ARequest());
		dataPartEClass.getESuperTypes().add(this.getPart());
		filePartEClass.getESuperTypes().add(this.getPart());
		getTaskRequestEClass.getESuperTypes().add(this.getA2ARequest());
		getTaskPushNotificationRequestEClass.getESuperTypes().add(this.getA2ARequest());
		setTaskPushNotificationRequestEClass.getESuperTypes().add(this.getA2ARequest());
		textPartEClass.getESuperTypes().add(this.getPart());
		taskResubscriptionRequestEClass.getESuperTypes().add(this.getA2ARequest());
		cancelTaskRequestEClass.getESuperTypes().add(this.getA2ARequest());
		taskArtifactUpdateEventEClass.getESuperTypes().add(this.getSendTaskStreamingResponseResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Id(), ecorePackage.getEString(), "id", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_SessionId(), ecorePackage.getEString(), "sessionId", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_History(), this.getMessage(), null, "history", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Status(), this.getTaskStatus(), null, "status", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsupportedOperationErrorEClass, UnsupportedOperationError.class, "UnsupportedOperationError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsupportedOperationError_Code(), ecorePackage.getEIntegerObject(), "code", "-32004", 1, 1, UnsupportedOperationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsupportedOperationError_Data(), ecorePackage.getEString(), "data", null, 1, 1, UnsupportedOperationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsupportedOperationError_Message(), ecorePackage.getEString(), "message", "This operation is not supported", 1, 1, UnsupportedOperationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonrpcRequestEClass, JSONRPCRequest.class, "JSONRPCRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONRPCRequest_Method(), ecorePackage.getEString(), "method", null, 1, 1, JSONRPCRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONRPCRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, JSONRPCRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONRPCRequest_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, JSONRPCRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJSONRPCRequest_Params(), ecorePackage.getEObject(), null, "params", null, 0, 1, JSONRPCRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskStatusUpdateEventEClass, TaskStatusUpdateEvent.class, "TaskStatusUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskStatusUpdateEvent_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, TaskStatusUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskStatusUpdateEvent_Final(), ecorePackage.getEBooleanObject(), "final", "false", 0, 1, TaskStatusUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskStatusUpdateEvent_Id(), ecorePackage.getEString(), "id", null, 1, 1, TaskStatusUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskStatusUpdateEvent_Status(), this.getTaskStatus(), null, "status", null, 1, 1, TaskStatusUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationInfoEClass, AuthenticationInfo.class, "AuthenticationInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationInfo_Credentials(), ecorePackage.getEString(), "credentials", null, 0, 1, AuthenticationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationInfo_Schemes(), ecorePackage.getEString(), "schemes", null, 0, -1, AuthenticationInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendTaskStreamingResponseResultEClass, SendTaskStreamingResponseResult.class, "SendTaskStreamingResponseResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendTaskStreamingResponseEClass, SendTaskStreamingResponse.class, "SendTaskStreamingResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendTaskStreamingResponse_Result(), this.getSendTaskStreamingResponseResult(), null, "result", null, 0, 1, SendTaskStreamingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendTaskStreamingResponse_Id(), ecorePackage.getEString(), "id", null, 0, 1, SendTaskStreamingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendTaskStreamingResponse_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, SendTaskStreamingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendTaskStreamingResponse_Error(), this.getJSONRPCError(), null, "error", null, 0, 1, SendTaskStreamingResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskPushNotificationConfigEClass, TaskPushNotificationConfig.class, "TaskPushNotificationConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskPushNotificationConfig_Id(), ecorePackage.getEString(), "id", null, 1, 1, TaskPushNotificationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskPushNotificationConfig_PushNotificationConfig(), this.getPushNotificationConfig(), null, "pushNotificationConfig", null, 1, 1, TaskPushNotificationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentCardEClass, AgentCard.class, "AgentCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgentCard_Skills(), this.getAgentSkill(), null, "skills", null, 0, -1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCard_DocumentationUrl(), ecorePackage.getEString(), "documentationUrl", null, 0, 1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentCard_Capabilities(), this.getAgentCapabilities(), null, "capabilities", null, 1, 1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentCard_Provider(), this.getAgentProvider(), null, "provider", null, 0, 1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCard_DefaultOutputModes(), ecorePackage.getEString(), "defaultOutputModes", "[\"text\"]", 0, -1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCard_Name(), ecorePackage.getEString(), "name", null, 1, 1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCard_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCard_Version(), ecorePackage.getEString(), "version", null, 1, 1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCard_DefaultInputModes(), ecorePackage.getEString(), "defaultInputModes", "[\"text\"]", 0, -1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCard_Url(), ecorePackage.getEString(), "url", null, 1, 1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentCard_Authentication(), this.getAgentAuthentication(), null, "authentication", null, 0, 1, AgentCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentCapabilitiesEClass, AgentCapabilities.class, "AgentCapabilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgentCapabilities_Streaming(), ecorePackage.getEBooleanObject(), "streaming", "false", 0, 1, AgentCapabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCapabilities_PushNotifications(), ecorePackage.getEBooleanObject(), "pushNotifications", "false", 0, 1, AgentCapabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentCapabilities_StateTransitionHistory(), ecorePackage.getEBooleanObject(), "stateTransitionHistory", "false", 0, 1, AgentCapabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendTaskRequestEClass, SendTaskRequest.class, "SendTaskRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendTaskRequest_Method(), ecorePackage.getEString(), "method", "tasks/send", 1, 1, SendTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendTaskRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, SendTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendTaskRequest_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, SendTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendTaskRequest_Params(), this.getTaskSendParams(), null, "params", null, 1, 1, SendTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonParseErrorEClass, JSONParseError.class, "JSONParseError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONParseError_Code(), ecorePackage.getEIntegerObject(), "code", "-32700", 1, 1, JSONParseError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJSONParseError_Data(), ecorePackage.getEObject(), null, "data", null, 0, 1, JSONParseError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONParseError_Message(), ecorePackage.getEString(), "message", "Invalid JSON payload", 1, 1, JSONParseError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPartEClass, DataPart.class, "DataPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPart_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, DataPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPart_Data(), ecorePackage.getEObject(), null, "data", null, 1, 1, DataPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPart_Type(), ecorePackage.getEString(), "type", "data", 1, 1, DataPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidRequestErrorEClass, InvalidRequestError.class, "InvalidRequestError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvalidRequestError_Code(), ecorePackage.getEIntegerObject(), "code", "-32600", 1, 1, InvalidRequestError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvalidRequestError_Data(), ecorePackage.getEObject(), null, "data", null, 0, 1, InvalidRequestError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidRequestError_Message(), ecorePackage.getEString(), "message", "Request payload validation error", 1, 1, InvalidRequestError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a2ARequestEClass, A2ARequest.class, "A2ARequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskNotFoundErrorEClass, TaskNotFoundError.class, "TaskNotFoundError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskNotFoundError_Code(), ecorePackage.getEIntegerObject(), "code", "-32001", 1, 1, TaskNotFoundError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskNotFoundError_Data(), ecorePackage.getEString(), "data", null, 1, 1, TaskNotFoundError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskNotFoundError_Message(), ecorePackage.getEString(), "message", "Task not found", 1, 1, TaskNotFoundError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonrpcResponseEClass, JSONRPCResponse.class, "JSONRPCResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJSONRPCResponse_Result(), ecorePackage.getEObject(), null, "result", null, 0, 1, JSONRPCResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONRPCResponse_Id(), ecorePackage.getEString(), "id", null, 0, 1, JSONRPCResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONRPCResponse_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, JSONRPCResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJSONRPCResponse_Error(), this.getJSONRPCError(), null, "error", null, 0, 1, JSONRPCResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filePartEClass, FilePart.class, "FilePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilePart_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, FilePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilePart_File(), this.getFileContent(), null, "file", null, 1, 1, FilePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilePart_Type(), ecorePackage.getEString(), "type", "file", 1, 1, FilePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskQueryParamsEClass, TaskQueryParams.class, "TaskQueryParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskQueryParams_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, TaskQueryParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskQueryParams_HistoryLength(), ecorePackage.getEIntegerObject(), "historyLength", null, 0, 1, TaskQueryParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskQueryParams_Id(), ecorePackage.getEString(), "id", null, 1, 1, TaskQueryParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushNotificationConfigEClass, PushNotificationConfig.class, "PushNotificationConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPushNotificationConfig_Url(), ecorePackage.getEString(), "url", null, 1, 1, PushNotificationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushNotificationConfig_Token(), ecorePackage.getEString(), "token", null, 0, 1, PushNotificationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPushNotificationConfig_Authentication(), this.getAuthenticationInfo(), null, "authentication", null, 0, 1, PushNotificationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalErrorEClass, org.nasdanika.models.a2a.InternalError.class, "InternalError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalError_Code(), ecorePackage.getEIntegerObject(), "code", "-32603", 1, 1, org.nasdanika.models.a2a.InternalError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalError_Data(), ecorePackage.getEObject(), null, "data", null, 0, 1, org.nasdanika.models.a2a.InternalError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalError_Message(), ecorePackage.getEString(), "message", "Internal error", 1, 1, org.nasdanika.models.a2a.InternalError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentAuthenticationEClass, AgentAuthentication.class, "AgentAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgentAuthentication_Credentials(), ecorePackage.getEString(), "credentials", null, 0, 1, AgentAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentAuthentication_Schemes(), ecorePackage.getEString(), "schemes", null, 0, -1, AgentAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushNotificationNotSupportedErrorEClass, PushNotificationNotSupportedError.class, "PushNotificationNotSupportedError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPushNotificationNotSupportedError_Code(), ecorePackage.getEIntegerObject(), "code", "-32003", 1, 1, PushNotificationNotSupportedError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushNotificationNotSupportedError_Data(), ecorePackage.getEString(), "data", null, 1, 1, PushNotificationNotSupportedError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPushNotificationNotSupportedError_Message(), ecorePackage.getEString(), "message", "Push Notification is not supported", 1, 1, PushNotificationNotSupportedError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTaskRequestEClass, GetTaskRequest.class, "GetTaskRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetTaskRequest_Method(), ecorePackage.getEString(), "method", "tasks/get", 1, 1, GetTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetTaskRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, GetTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetTaskRequest_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, GetTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetTaskRequest_Params(), this.getTaskQueryParams(), null, "params", null, 1, 1, GetTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentSkillEClass, AgentSkill.class, "AgentSkill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgentSkill_InputModes(), ecorePackage.getEString(), "inputModes", null, 0, -1, AgentSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentSkill_OutputModes(), ecorePackage.getEString(), "outputModes", null, 0, -1, AgentSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentSkill_Examples(), ecorePackage.getEString(), "examples", null, 0, -1, AgentSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentSkill_Name(), ecorePackage.getEString(), "name", null, 1, 1, AgentSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentSkill_Description(), ecorePackage.getEString(), "description", null, 0, 1, AgentSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentSkill_Id(), ecorePackage.getEString(), "id", null, 1, 1, AgentSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentSkill_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, AgentSkill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Role(), ecorePackage.getEString(), "role", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Parts(), this.getPart(), null, "parts", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendTaskStreamingRequestEClass, SendTaskStreamingRequest.class, "SendTaskStreamingRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendTaskStreamingRequest_Method(), ecorePackage.getEString(), "method", "tasks/sendSubscribe", 1, 1, SendTaskStreamingRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendTaskStreamingRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, SendTaskStreamingRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendTaskStreamingRequest_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, SendTaskStreamingRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendTaskStreamingRequest_Params(), this.getTaskSendParams(), null, "params", null, 1, 1, SendTaskStreamingRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTaskPushNotificationRequestEClass, GetTaskPushNotificationRequest.class, "GetTaskPushNotificationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetTaskPushNotificationRequest_Method(), ecorePackage.getEString(), "method", "tasks/pushNotification/get", 1, 1, GetTaskPushNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetTaskPushNotificationRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, GetTaskPushNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetTaskPushNotificationRequest_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, GetTaskPushNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetTaskPushNotificationRequest_Params(), this.getTaskIdParams(), null, "params", null, 1, 1, GetTaskPushNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonrpcErrorEClass, JSONRPCError.class, "JSONRPCError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONRPCError_Code(), ecorePackage.getEIntegerObject(), "code", null, 1, 1, JSONRPCError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJSONRPCError_Data(), ecorePackage.getEObject(), null, "data", null, 0, 1, JSONRPCError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONRPCError_Message(), ecorePackage.getEString(), "message", null, 1, 1, JSONRPCError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidParamsErrorEClass, InvalidParamsError.class, "InvalidParamsError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvalidParamsError_Code(), ecorePackage.getEIntegerObject(), "code", "-32602", 1, 1, InvalidParamsError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvalidParamsError_Data(), ecorePackage.getEObject(), null, "data", null, 0, 1, InvalidParamsError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidParamsError_Message(), ecorePackage.getEString(), "message", "Invalid parameters", 1, 1, InvalidParamsError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cancelTaskResponseEClass, CancelTaskResponse.class, "CancelTaskResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCancelTaskResponse_Result(), this.getTask(), null, "result", null, 0, 1, CancelTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCancelTaskResponse_Id(), ecorePackage.getEString(), "id", null, 0, 1, CancelTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCancelTaskResponse_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, CancelTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCancelTaskResponse_Error(), this.getJSONRPCError(), null, "error", null, 0, 1, CancelTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendTaskResponseEClass, SendTaskResponse.class, "SendTaskResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendTaskResponse_Result(), this.getTask(), null, "result", null, 0, 1, SendTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendTaskResponse_Id(), ecorePackage.getEString(), "id", null, 0, 1, SendTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendTaskResponse_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, SendTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendTaskResponse_Error(), this.getJSONRPCError(), null, "error", null, 0, 1, SendTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTaskPushNotificationRequestEClass, SetTaskPushNotificationRequest.class, "SetTaskPushNotificationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetTaskPushNotificationRequest_Method(), ecorePackage.getEString(), "method", "tasks/pushNotification/set", 1, 1, SetTaskPushNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetTaskPushNotificationRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, SetTaskPushNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetTaskPushNotificationRequest_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, SetTaskPushNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetTaskPushNotificationRequest_Params(), this.getTaskPushNotificationConfig(), null, "params", null, 1, 1, SetTaskPushNotificationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textPartEClass, TextPart.class, "TextPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextPart_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, TextPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextPart_Text(), ecorePackage.getEString(), "text", null, 1, 1, TextPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextPart_Type(), ecorePackage.getEString(), "type", "text", 1, 1, TextPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTaskResponseEClass, GetTaskResponse.class, "GetTaskResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetTaskResponse_Result(), this.getTask(), null, "result", null, 0, 1, GetTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetTaskResponse_Id(), ecorePackage.getEString(), "id", null, 0, 1, GetTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetTaskResponse_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, GetTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetTaskResponse_Error(), this.getJSONRPCError(), null, "error", null, 0, 1, GetTaskResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskSendParamsEClass, TaskSendParams.class, "TaskSendParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskSendParams_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, TaskSendParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskSendParams_HistoryLength(), ecorePackage.getEIntegerObject(), "historyLength", null, 0, 1, TaskSendParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskSendParams_Id(), ecorePackage.getEString(), "id", null, 1, 1, TaskSendParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskSendParams_SessionId(), ecorePackage.getEString(), "sessionId", null, 0, 1, TaskSendParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskSendParams_Message(), this.getMessage(), null, "message", null, 1, 1, TaskSendParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskSendParams_PushNotification(), this.getPushNotificationConfig(), null, "pushNotification", null, 0, 1, TaskSendParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskStatusEClass, TaskStatus.class, "TaskStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskStatus_State(), this.getTaskState(), "state", null, 1, 1, TaskStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskStatus_Message(), this.getMessage(), null, "message", null, 0, 1, TaskStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskStatus_Timestamp(), ecorePackage.getEString(), "timestamp", null, 0, 1, TaskStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_LastChunk(), ecorePackage.getEBooleanObject(), "lastChunk", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Parts(), this.getPart(), null, "parts", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Description(), ecorePackage.getEString(), "description", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Index(), ecorePackage.getEIntegerObject(), "index", "0", 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Append(), ecorePackage.getEBooleanObject(), "append", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTaskPushNotificationResponseEClass, SetTaskPushNotificationResponse.class, "SetTaskPushNotificationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetTaskPushNotificationResponse_Result(), this.getTaskPushNotificationConfig(), null, "result", null, 0, 1, SetTaskPushNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetTaskPushNotificationResponse_Id(), ecorePackage.getEString(), "id", null, 0, 1, SetTaskPushNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetTaskPushNotificationResponse_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, SetTaskPushNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetTaskPushNotificationResponse_Error(), this.getJSONRPCError(), null, "error", null, 0, 1, SetTaskPushNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileContentEClass, FileContent.class, "FileContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileContent_Bytes(), ecorePackage.getEString(), "bytes", null, 0, 1, FileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileContent_Name(), ecorePackage.getEString(), "name", null, 0, 1, FileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileContent_MimeType(), ecorePackage.getEString(), "mimeType", null, 0, 1, FileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileContent_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, FileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodNotFoundErrorEClass, MethodNotFoundError.class, "MethodNotFoundError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodNotFoundError_Code(), ecorePackage.getEIntegerObject(), "code", "-32601", 1, 1, MethodNotFoundError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodNotFoundError_Data(), ecorePackage.getEString(), "data", null, 1, 1, MethodNotFoundError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodNotFoundError_Message(), ecorePackage.getEString(), "message", "Method not found", 1, 1, MethodNotFoundError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskResubscriptionRequestEClass, TaskResubscriptionRequest.class, "TaskResubscriptionRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskResubscriptionRequest_Method(), ecorePackage.getEString(), "method", "tasks/resubscribe", 1, 1, TaskResubscriptionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResubscriptionRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, TaskResubscriptionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResubscriptionRequest_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, TaskResubscriptionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskResubscriptionRequest_Params(), this.getTaskQueryParams(), null, "params", null, 1, 1, TaskResubscriptionRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonrpcMessageEClass, JSONRPCMessage.class, "JSONRPCMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONRPCMessage_Id(), ecorePackage.getEString(), "id", null, 0, 1, JSONRPCMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONRPCMessage_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, JSONRPCMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskIdParamsEClass, TaskIdParams.class, "TaskIdParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskIdParams_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, TaskIdParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskIdParams_Id(), ecorePackage.getEString(), "id", null, 1, 1, TaskIdParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskNotCancelableErrorEClass, TaskNotCancelableError.class, "TaskNotCancelableError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskNotCancelableError_Code(), ecorePackage.getEIntegerObject(), "code", "-32002", 1, 1, TaskNotCancelableError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskNotCancelableError_Data(), ecorePackage.getEString(), "data", null, 1, 1, TaskNotCancelableError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskNotCancelableError_Message(), ecorePackage.getEString(), "message", "Task cannot be canceled", 1, 1, TaskNotCancelableError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cancelTaskRequestEClass, CancelTaskRequest.class, "CancelTaskRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCancelTaskRequest_Method(), ecorePackage.getEString(), "method", "tasks/cancel", 1, 1, CancelTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCancelTaskRequest_Id(), ecorePackage.getEString(), "id", null, 0, 1, CancelTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCancelTaskRequest_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, CancelTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCancelTaskRequest_Params(), this.getTaskIdParams(), null, "params", null, 1, 1, CancelTaskRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTaskPushNotificationResponseEClass, GetTaskPushNotificationResponse.class, "GetTaskPushNotificationResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetTaskPushNotificationResponse_Result(), this.getTaskPushNotificationConfig(), null, "result", null, 0, 1, GetTaskPushNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetTaskPushNotificationResponse_Id(), ecorePackage.getEString(), "id", null, 0, 1, GetTaskPushNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetTaskPushNotificationResponse_Jsonrpc(), ecorePackage.getEString(), "jsonrpc", "2.0", 0, 1, GetTaskPushNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetTaskPushNotificationResponse_Error(), this.getJSONRPCError(), null, "error", null, 0, 1, GetTaskPushNotificationResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskArtifactUpdateEventEClass, TaskArtifactUpdateEvent.class, "TaskArtifactUpdateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskArtifactUpdateEvent_Artifact(), this.getArtifact(), null, "artifact", null, 1, 1, TaskArtifactUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskArtifactUpdateEvent_Metadata(), ecorePackage.getEObject(), null, "metadata", null, 0, 1, TaskArtifactUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskArtifactUpdateEvent_Id(), ecorePackage.getEString(), "id", null, 1, 1, TaskArtifactUpdateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentProviderEClass, AgentProvider.class, "AgentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgentProvider_Organization(), ecorePackage.getEString(), "organization", null, 1, 1, AgentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentProvider_Url(), ecorePackage.getEString(), "url", null, 0, 1, AgentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(taskStateEEnum, TaskState.class, "TaskState");
		addEEnumLiteral(taskStateEEnum, TaskState.SUBMITTED);
		addEEnumLiteral(taskStateEEnum, TaskState.WORKING);
		addEEnumLiteral(taskStateEEnum, TaskState.INPUT_REQUIRED);
		addEEnumLiteral(taskStateEEnum, TaskState.COMPLETED);
		addEEnumLiteral(taskStateEEnum, TaskState.CANCELED);
		addEEnumLiteral(taskStateEEnum, TaskState.FAILED);
		addEEnumLiteral(taskStateEEnum, TaskState.UNKNOWN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (taskEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Task\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"id\": {\n      \"title\": \"Id\",\n      \"type\": \"string\"\n    },\n    \"sessionId\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Sessionid\"\n    },\n    \"history\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"type\": \"array\",\n          \"items\": {\"$ref\": \"#/$defs/Message\"}\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"History\"\n    },\n    \"status\": {\"$ref\": \"#/$defs/TaskStatus\"},\n    \"artifacts\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"type\": \"array\",\n          \"items\": {\"$ref\": \"#/$defs/Artifact\"}\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Artifacts\"\n    }\n  },\n  \"required\": [\n    \"id\",\n    \"status\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTask_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTask_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Id\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTask_SessionId(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Sessionid\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTask_History(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"type\": \"array\",\n      \"items\": {\"$ref\": \"#/$defs/Message\"}\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"History\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTask_Status(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskStatus\"}\n```\n\n"
		   });
		addAnnotation
		  (getTask_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"type\": \"array\",\n      \"items\": {\"$ref\": \"#/$defs/Artifact\"}\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Artifacts\"\n}\n```\n\n"
		   });
		addAnnotation
		  (unsupportedOperationErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"UnsupportedOperationError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32004,\n      \"const\": -32004,\n      \"examples\": [-32004],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"const\": null,\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"This operation is not supported\",\n      \"const\": \"This operation is not supported\",\n      \"examples\": [\"This operation is not supported\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\",\n    \"data\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getUnsupportedOperationError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32004,\n  \"const\": -32004,\n  \"examples\": [-32004],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getUnsupportedOperationError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"const\": null,\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getUnsupportedOperationError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"This operation is not supported\",\n  \"const\": \"This operation is not supported\",\n  \"examples\": [\"This operation is not supported\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (jsonrpcRequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"JSONRPCRequest\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"method\": {\n      \"title\": \"Method\",\n      \"type\": \"string\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"params\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Params\"\n    }\n  },\n  \"required\": [\"method\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Method\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCRequest_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCRequest_Params(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Params\"\n}\n```\n\n"
		   });
		addAnnotation
		  (taskStatusUpdateEventEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskStatusUpdateEvent\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"final\": {\n      \"default\": false,\n      \"title\": \"Final\",\n      \"type\": \"boolean\"\n    },\n    \"id\": {\n      \"title\": \"Id\",\n      \"type\": \"string\"\n    },\n    \"status\": {\"$ref\": \"#/$defs/TaskStatus\"}\n  },\n  \"required\": [\n    \"id\",\n    \"status\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskStatusUpdateEvent_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskStatusUpdateEvent_Final(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": false,\n  \"title\": \"Final\",\n  \"type\": \"boolean\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskStatusUpdateEvent_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Id\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskStatusUpdateEvent_Status(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskStatus\"}\n```\n\n"
		   });
		addAnnotation
		  (authenticationInfoEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"additionalProperties\": {},\n  \"title\": \"AuthenticationInfo\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"credentials\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Credentials\"\n    },\n    \"schemes\": {\n      \"title\": \"Schemes\",\n      \"type\": \"array\",\n      \"items\": {\"type\": \"string\"}\n    }\n  },\n  \"required\": [\"schemes\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getAuthenticationInfo_Credentials(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Credentials\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAuthenticationInfo_Schemes(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Schemes\",\n  \"type\": \"array\",\n  \"items\": {\"type\": \"string\"}\n}\n```\n\n"
		   });
		addAnnotation
		  (sendTaskStreamingResponseEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"SendTaskStreamingResponse\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"result\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/TaskStatusUpdateEvent\"},\n        {\"$ref\": \"#/$defs/TaskArtifactUpdateEvent\"},\n        {\"type\": \"null\"}\n      ]\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"error\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/JSONRPCError\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskStreamingResponse_Result(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/TaskStatusUpdateEvent\"},\n    {\"$ref\": \"#/$defs/TaskArtifactUpdateEvent\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskStreamingResponse_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskStreamingResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskStreamingResponse_Error(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/JSONRPCError\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (taskPushNotificationConfigEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskPushNotificationConfig\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"id\": {\n      \"title\": \"Id\",\n      \"type\": \"string\"\n    },\n    \"pushNotificationConfig\": {\"$ref\": \"#/$defs/PushNotificationConfig\"}\n  },\n  \"required\": [\n    \"id\",\n    \"pushNotificationConfig\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskPushNotificationConfig_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Id\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskPushNotificationConfig_PushNotificationConfig(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/PushNotificationConfig\"}\n```\n\n"
		   });
		addAnnotation
		  (agentCardEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"AgentCard\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"skills\": {\n      \"title\": \"Skills\",\n      \"type\": \"array\",\n      \"items\": {\"$ref\": \"#/$defs/AgentSkill\"}\n    },\n    \"documentationUrl\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Documentationurl\"\n    },\n    \"capabilities\": {\"$ref\": \"#/$defs/AgentCapabilities\"},\n    \"provider\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/AgentProvider\"},\n        {\"type\": \"null\"}\n      ]\n    },\n    \"defaultOutputModes\": {\n      \"default\": [\"text\"],\n      \"title\": \"Defaultoutputmodes\",\n      \"type\": \"array\",\n      \"items\": {\"type\": \"string\"}\n    },\n    \"name\": {\n      \"title\": \"Name\",\n      \"type\": \"string\"\n    },\n    \"description\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Description\"\n    },\n    \"version\": {\n      \"title\": \"Version\",\n      \"type\": \"string\"\n    },\n    \"defaultInputModes\": {\n      \"default\": [\"text\"],\n      \"title\": \"Defaultinputmodes\",\n      \"type\": \"array\",\n      \"items\": {\"type\": \"string\"}\n    },\n    \"url\": {\n      \"title\": \"Url\",\n      \"type\": \"string\"\n    },\n    \"authentication\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/AgentAuthentication\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  },\n  \"required\": [\n    \"name\",\n    \"url\",\n    \"version\",\n    \"capabilities\",\n    \"skills\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_Skills(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Skills\",\n  \"type\": \"array\",\n  \"items\": {\"$ref\": \"#/$defs/AgentSkill\"}\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_DocumentationUrl(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Documentationurl\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_Capabilities(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/AgentCapabilities\"}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_Provider(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/AgentProvider\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_DefaultOutputModes(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": [\"text\"],\n  \"title\": \"Defaultoutputmodes\",\n  \"type\": \"array\",\n  \"items\": {\"type\": \"string\"}\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_Name(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Name\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_Description(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Description\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_Version(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Version\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_DefaultInputModes(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": [\"text\"],\n  \"title\": \"Defaultinputmodes\",\n  \"type\": \"array\",\n  \"items\": {\"type\": \"string\"}\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_Url(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Url\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCard_Authentication(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/AgentAuthentication\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (agentCapabilitiesEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"AgentCapabilities\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"streaming\": {\n      \"default\": false,\n      \"title\": \"Streaming\",\n      \"type\": \"boolean\"\n    },\n    \"pushNotifications\": {\n      \"default\": false,\n      \"title\": \"PushNotifications\",\n      \"type\": \"boolean\"\n    },\n    \"stateTransitionHistory\": {\n      \"default\": false,\n      \"title\": \"Statetransitionhistory\",\n      \"type\": \"boolean\"\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCapabilities_Streaming(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": false,\n  \"title\": \"Streaming\",\n  \"type\": \"boolean\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCapabilities_PushNotifications(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": false,\n  \"title\": \"PushNotifications\",\n  \"type\": \"boolean\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentCapabilities_StateTransitionHistory(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": false,\n  \"title\": \"Statetransitionhistory\",\n  \"type\": \"boolean\"\n}\n```\n\n"
		   });
		addAnnotation
		  (sendTaskRequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"SendTaskRequest\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"method\": {\n      \"default\": \"tasks/send\",\n      \"const\": \"tasks/send\",\n      \"title\": \"Method\",\n      \"type\": \"string\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"params\": {\"$ref\": \"#/$defs/TaskSendParams\"}\n  },\n  \"required\": [\n    \"method\",\n    \"params\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"tasks/send\",\n  \"const\": \"tasks/send\",\n  \"title\": \"Method\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskRequest_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskRequest_Params(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskSendParams\"}\n```\n\n"
		   });
		addAnnotation
		  (jsonParseErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"JSONParseError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32700,\n      \"const\": -32700,\n      \"examples\": [-32700],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"Invalid JSON payload\",\n      \"const\": \"Invalid JSON payload\",\n      \"examples\": [\"Invalid JSON payload\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONParseError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32700,\n  \"const\": -32700,\n  \"examples\": [-32700],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONParseError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONParseError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"Invalid JSON payload\",\n  \"const\": \"Invalid JSON payload\",\n  \"examples\": [\"Invalid JSON payload\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (dataPartEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"DataPart\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"data\": {\n      \"additionalProperties\": {},\n      \"title\": \"Data\",\n      \"type\": \"object\"\n    },\n    \"type\": {\n      \"default\": \"data\",\n      \"const\": \"data\",\n      \"examples\": [\"data\"],\n      \"description\": \"Type of the part\",\n      \"title\": \"Type\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"type\",\n    \"data\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getDataPart_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getDataPart_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"additionalProperties\": {},\n  \"title\": \"Data\",\n  \"type\": \"object\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getDataPart_Type(),
		   source,
		   new String[] {
			   "documentation", "Type of the part\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"data\",\n  \"const\": \"data\",\n  \"examples\": [\"data\"],\n  \"description\": \"Type of the part\",\n  \"title\": \"Type\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (invalidRequestErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"InvalidRequestError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32600,\n      \"const\": -32600,\n      \"examples\": [-32600],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"Request payload validation error\",\n      \"const\": \"Request payload validation error\",\n      \"examples\": [\"Request payload validation error\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getInvalidRequestError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32600,\n  \"const\": -32600,\n  \"examples\": [-32600],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getInvalidRequestError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getInvalidRequestError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"Request payload validation error\",\n  \"const\": \"Request payload validation error\",\n  \"examples\": [\"Request payload validation error\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (a2ARequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"oneOf\": [\n    {\"$ref\": \"#/$defs/SendTaskRequest\"},\n    {\"$ref\": \"#/$defs/GetTaskRequest\"},\n    {\"$ref\": \"#/$defs/CancelTaskRequest\"},\n    {\"$ref\": \"#/$defs/SetTaskPushNotificationRequest\"},\n    {\"$ref\": \"#/$defs/GetTaskPushNotificationRequest\"},\n    {\"$ref\": \"#/$defs/TaskResubscriptionRequest\"}\n  ],\n  \"title\": \"A2ARequest\"\n}\n```\n\n"
		   });
		addAnnotation
		  (taskNotFoundErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskNotFoundError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32001,\n      \"const\": -32001,\n      \"examples\": [-32001],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"const\": null,\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"Task not found\",\n      \"const\": \"Task not found\",\n      \"examples\": [\"Task not found\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\",\n    \"data\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskNotFoundError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32001,\n  \"const\": -32001,\n  \"examples\": [-32001],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskNotFoundError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"const\": null,\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskNotFoundError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"Task not found\",\n  \"const\": \"Task not found\",\n  \"examples\": [\"Task not found\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (jsonrpcResponseEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"JSONRPCResponse\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"result\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Result\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"error\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/JSONRPCError\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCResponse_Result(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Result\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCResponse_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCResponse_Error(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/JSONRPCError\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (filePartEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"FilePart\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"file\": {\"$ref\": \"#/$defs/FileContent\"},\n    \"type\": {\n      \"default\": \"file\",\n      \"const\": \"file\",\n      \"examples\": [\"file\"],\n      \"description\": \"Type of the part\",\n      \"title\": \"Type\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"type\",\n    \"file\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getFilePart_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getFilePart_File(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/FileContent\"}\n```\n\n"
		   });
		addAnnotation
		  (getFilePart_Type(),
		   source,
		   new String[] {
			   "documentation", "Type of the part\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"file\",\n  \"const\": \"file\",\n  \"examples\": [\"file\"],\n  \"description\": \"Type of the part\",\n  \"title\": \"Type\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (taskQueryParamsEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskQueryParams\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"historyLength\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"HistoryLength\"\n    },\n    \"id\": {\n      \"title\": \"Id\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\"id\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskQueryParams_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskQueryParams_HistoryLength(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"HistoryLength\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskQueryParams_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Id\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (pushNotificationConfigEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"PushNotificationConfig\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"url\": {\n      \"title\": \"Url\",\n      \"type\": \"string\"\n    },\n    \"token\": {\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Token\"\n    },\n    \"authentication\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/AuthenticationInfo\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  },\n  \"required\": [\"url\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getPushNotificationConfig_Url(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Url\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getPushNotificationConfig_Token(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Token\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getPushNotificationConfig_Authentication(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/AuthenticationInfo\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (partEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/TextPart\"},\n    {\"$ref\": \"#/$defs/FilePart\"},\n    {\"$ref\": \"#/$defs/DataPart\"}\n  ],\n  \"title\": \"Part\"\n}\n```\n\n"
		   });
		addAnnotation
		  (internalErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"InternalError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32603,\n      \"const\": -32603,\n      \"examples\": [-32603],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"Internal error\",\n      \"const\": \"Internal error\",\n      \"examples\": [\"Internal error\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getInternalError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32603,\n  \"const\": -32603,\n  \"examples\": [-32603],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getInternalError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getInternalError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"Internal error\",\n  \"const\": \"Internal error\",\n  \"examples\": [\"Internal error\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (agentAuthenticationEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"AgentAuthentication\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"credentials\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Credentials\"\n    },\n    \"schemes\": {\n      \"title\": \"Schemes\",\n      \"type\": \"array\",\n      \"items\": {\"type\": \"string\"}\n    }\n  },\n  \"required\": [\"schemes\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentAuthentication_Credentials(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Credentials\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentAuthentication_Schemes(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Schemes\",\n  \"type\": \"array\",\n  \"items\": {\"type\": \"string\"}\n}\n```\n\n"
		   });
		addAnnotation
		  (pushNotificationNotSupportedErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"PushNotificationNotSupportedError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32003,\n      \"const\": -32003,\n      \"examples\": [-32003],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"const\": null,\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"Push Notification is not supported\",\n      \"const\": \"Push Notification is not supported\",\n      \"examples\": [\"Push Notification is not supported\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\",\n    \"data\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getPushNotificationNotSupportedError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32003,\n  \"const\": -32003,\n  \"examples\": [-32003],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getPushNotificationNotSupportedError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"const\": null,\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getPushNotificationNotSupportedError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"Push Notification is not supported\",\n  \"const\": \"Push Notification is not supported\",\n  \"examples\": [\"Push Notification is not supported\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskRequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"GetTaskRequest\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"method\": {\n      \"default\": \"tasks/get\",\n      \"const\": \"tasks/get\",\n      \"title\": \"Method\",\n      \"type\": \"string\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"params\": {\"$ref\": \"#/$defs/TaskQueryParams\"}\n  },\n  \"required\": [\n    \"method\",\n    \"params\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"tasks/get\",\n  \"const\": \"tasks/get\",\n  \"title\": \"Method\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskRequest_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskRequest_Params(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskQueryParams\"}\n```\n\n"
		   });
		addAnnotation
		  (agentSkillEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"AgentSkill\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"inputModes\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"type\": \"array\",\n          \"items\": {\"type\": \"string\"}\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Inputmodes\"\n    },\n    \"outputModes\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"type\": \"array\",\n          \"items\": {\"type\": \"string\"}\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Outputmodes\"\n    },\n    \"examples\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"type\": \"array\",\n          \"items\": {\"type\": \"string\"}\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Examples\"\n    },\n    \"name\": {\n      \"title\": \"Name\",\n      \"type\": \"string\"\n    },\n    \"description\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Description\"\n    },\n    \"id\": {\n      \"title\": \"Id\",\n      \"type\": \"string\"\n    },\n    \"tags\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"type\": \"array\",\n          \"items\": {\"type\": \"string\"}\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Tags\"\n    }\n  },\n  \"required\": [\n    \"id\",\n    \"name\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentSkill_InputModes(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"type\": \"array\",\n      \"items\": {\"type\": \"string\"}\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Inputmodes\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentSkill_OutputModes(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"type\": \"array\",\n      \"items\": {\"type\": \"string\"}\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Outputmodes\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentSkill_Examples(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"type\": \"array\",\n      \"items\": {\"type\": \"string\"}\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Examples\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentSkill_Name(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Name\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentSkill_Description(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Description\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentSkill_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Id\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentSkill_Tags(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"type\": \"array\",\n      \"items\": {\"type\": \"string\"}\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Tags\"\n}\n```\n\n"
		   });
		addAnnotation
		  (messageEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Message\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"role\": {\n      \"title\": \"Role\",\n      \"type\": \"string\",\n      \"enum\": [\n        \"user\",\n        \"agent\"\n      ]\n    },\n    \"parts\": {\n      \"title\": \"Parts\",\n      \"type\": \"array\",\n      \"items\": {\"$ref\": \"#/$defs/Part\"}\n    }\n  },\n  \"required\": [\n    \"role\",\n    \"parts\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getMessage_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getMessage_Role(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Role\",\n  \"type\": \"string\",\n  \"enum\": [\n    \"user\",\n    \"agent\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getMessage_Parts(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Parts\",\n  \"type\": \"array\",\n  \"items\": {\"$ref\": \"#/$defs/Part\"}\n}\n```\n\n"
		   });
		addAnnotation
		  (sendTaskStreamingRequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"SendTaskStreamingRequest\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"method\": {\n      \"default\": \"tasks/sendSubscribe\",\n      \"const\": \"tasks/sendSubscribe\",\n      \"title\": \"Method\",\n      \"type\": \"string\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"params\": {\"$ref\": \"#/$defs/TaskSendParams\"}\n  },\n  \"required\": [\n    \"method\",\n    \"params\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskStreamingRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"tasks/sendSubscribe\",\n  \"const\": \"tasks/sendSubscribe\",\n  \"title\": \"Method\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskStreamingRequest_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskStreamingRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskStreamingRequest_Params(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskSendParams\"}\n```\n\n"
		   });
		addAnnotation
		  (getTaskPushNotificationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"GetTaskPushNotificationRequest\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"method\": {\n      \"default\": \"tasks/pushNotification/get\",\n      \"const\": \"tasks/pushNotification/get\",\n      \"title\": \"Method\",\n      \"type\": \"string\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"params\": {\"$ref\": \"#/$defs/TaskIdParams\"}\n  },\n  \"required\": [\n    \"method\",\n    \"params\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskPushNotificationRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"tasks/pushNotification/get\",\n  \"const\": \"tasks/pushNotification/get\",\n  \"title\": \"Method\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskPushNotificationRequest_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskPushNotificationRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskPushNotificationRequest_Params(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskIdParams\"}\n```\n\n"
		   });
		addAnnotation
		  (jsonrpcErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"JSONRPCError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCError_Code(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCError_Message(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (invalidParamsErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"InvalidParamsError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32602,\n      \"const\": -32602,\n      \"examples\": [-32602],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"Invalid parameters\",\n      \"const\": \"Invalid parameters\",\n      \"examples\": [\"Invalid parameters\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getInvalidParamsError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32602,\n  \"const\": -32602,\n  \"examples\": [-32602],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getInvalidParamsError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getInvalidParamsError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"Invalid parameters\",\n  \"const\": \"Invalid parameters\",\n  \"examples\": [\"Invalid parameters\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (cancelTaskResponseEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"CancelTaskResponse\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"result\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/Task\"},\n        {\"type\": \"null\"}\n      ]\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"error\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/JSONRPCError\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getCancelTaskResponse_Result(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/Task\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getCancelTaskResponse_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getCancelTaskResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getCancelTaskResponse_Error(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/JSONRPCError\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (sendTaskResponseEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"SendTaskResponse\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"result\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/Task\"},\n        {\"type\": \"null\"}\n      ]\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"error\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/JSONRPCError\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskResponse_Result(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/Task\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskResponse_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSendTaskResponse_Error(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/JSONRPCError\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (setTaskPushNotificationRequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"SetTaskPushNotificationRequest\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"method\": {\n      \"default\": \"tasks/pushNotification/set\",\n      \"const\": \"tasks/pushNotification/set\",\n      \"title\": \"Method\",\n      \"type\": \"string\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"params\": {\"$ref\": \"#/$defs/TaskPushNotificationConfig\"}\n  },\n  \"required\": [\n    \"method\",\n    \"params\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getSetTaskPushNotificationRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"tasks/pushNotification/set\",\n  \"const\": \"tasks/pushNotification/set\",\n  \"title\": \"Method\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSetTaskPushNotificationRequest_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSetTaskPushNotificationRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSetTaskPushNotificationRequest_Params(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskPushNotificationConfig\"}\n```\n\n"
		   });
		addAnnotation
		  (textPartEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TextPart\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"text\": {\n      \"title\": \"Text\",\n      \"type\": \"string\"\n    },\n    \"type\": {\n      \"default\": \"text\",\n      \"const\": \"text\",\n      \"examples\": [\"text\"],\n      \"description\": \"Type of the part\",\n      \"title\": \"Type\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"type\",\n    \"text\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTextPart_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTextPart_Text(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Text\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTextPart_Type(),
		   source,
		   new String[] {
			   "documentation", "Type of the part\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"text\",\n  \"const\": \"text\",\n  \"examples\": [\"text\"],\n  \"description\": \"Type of the part\",\n  \"title\": \"Type\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskResponseEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"GetTaskResponse\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"result\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/Task\"},\n        {\"type\": \"null\"}\n      ]\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"error\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/JSONRPCError\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskResponse_Result(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/Task\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskResponse_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskResponse_Error(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/JSONRPCError\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (taskSendParamsEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskSendParams\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"historyLength\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"HistoryLength\"\n    },\n    \"id\": {\n      \"title\": \"Id\",\n      \"type\": \"string\"\n    },\n    \"sessionId\": {\n      \"title\": \"Sessionid\",\n      \"type\": \"string\"\n    },\n    \"message\": {\"$ref\": \"#/$defs/Message\"},\n    \"pushNotification\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/PushNotificationConfig\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  },\n  \"required\": [\n    \"id\",\n    \"message\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskSendParams_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskSendParams_HistoryLength(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"HistoryLength\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskSendParams_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Id\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskSendParams_SessionId(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Sessionid\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskSendParams_Message(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/Message\"}\n```\n\n"
		   });
		addAnnotation
		  (getTaskSendParams_PushNotification(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/PushNotificationConfig\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (taskStatusEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskStatus\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"state\": {\"$ref\": \"#/$defs/TaskState\"},\n    \"message\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/Message\"},\n        {\"type\": \"null\"}\n      ]\n    },\n    \"timestamp\": {\n      \"format\": \"date-time\",\n      \"title\": \"Timestamp\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\"state\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskStatus_State(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskState\"}\n```\n\n"
		   });
		addAnnotation
		  (getTaskStatus_Message(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/Message\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskStatus_Timestamp(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"format\": \"date-time\",\n  \"title\": \"Timestamp\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Artifact\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"lastChunk\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"boolean\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"LastChunk\"\n    },\n    \"name\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Name\"\n    },\n    \"parts\": {\n      \"title\": \"Parts\",\n      \"type\": \"array\",\n      \"items\": {\"$ref\": \"#/$defs/Part\"}\n    },\n    \"description\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Description\"\n    },\n    \"index\": {\n      \"default\": 0,\n      \"type\": \"integer\",\n      \"title\": \"Index\"\n    },\n    \"append\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"boolean\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Append\"\n    }\n  },\n  \"required\": [\"parts\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getArtifact_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getArtifact_LastChunk(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"boolean\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"LastChunk\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getArtifact_Name(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Name\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getArtifact_Parts(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Parts\",\n  \"type\": \"array\",\n  \"items\": {\"$ref\": \"#/$defs/Part\"}\n}\n```\n\n"
		   });
		addAnnotation
		  (getArtifact_Description(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Description\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getArtifact_Index(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": 0,\n  \"type\": \"integer\",\n  \"title\": \"Index\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getArtifact_Append(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"boolean\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Append\"\n}\n```\n\n"
		   });
		addAnnotation
		  (setTaskPushNotificationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"SetTaskPushNotificationResponse\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"result\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/TaskPushNotificationConfig\"},\n        {\"type\": \"null\"}\n      ]\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"error\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/JSONRPCError\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getSetTaskPushNotificationResponse_Result(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/TaskPushNotificationConfig\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getSetTaskPushNotificationResponse_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSetTaskPushNotificationResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getSetTaskPushNotificationResponse_Error(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/JSONRPCError\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (fileContentEClass,
		   source,
		   new String[] {
			   "documentation", "Represents the content of a file, either as base64 encoded bytes or a URI.\n\nEnsures that either \'bytes\' or \'uri\' is provided, but not both.\r\n\r\n## Specification\n\n```json\n{\n  \"description\": \"Represents the content of a file, either as base64 encoded bytes or a URI.\\n\\nEnsures that either \'bytes\' or \'uri\' is provided, but not both.\",\n  \"title\": \"FileContent\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"bytes\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Bytes\"\n    },\n    \"name\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Name\"\n    },\n    \"mimeType\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Mimetype\"\n    },\n    \"uri\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Uri\"\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getFileContent_Bytes(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Bytes\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getFileContent_Name(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Name\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getFileContent_MimeType(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Mimetype\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getFileContent_Uri(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Uri\"\n}\n```\n\n"
		   });
		addAnnotation
		  (methodNotFoundErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"MethodNotFoundError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32601,\n      \"const\": -32601,\n      \"examples\": [-32601],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"const\": null,\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"Method not found\",\n      \"const\": \"Method not found\",\n      \"examples\": [\"Method not found\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\",\n    \"data\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getMethodNotFoundError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32601,\n  \"const\": -32601,\n  \"examples\": [-32601],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getMethodNotFoundError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"const\": null,\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getMethodNotFoundError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"Method not found\",\n  \"const\": \"Method not found\",\n  \"examples\": [\"Method not found\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (taskResubscriptionRequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskResubscriptionRequest\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"method\": {\n      \"default\": \"tasks/resubscribe\",\n      \"const\": \"tasks/resubscribe\",\n      \"title\": \"Method\",\n      \"type\": \"string\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"params\": {\"$ref\": \"#/$defs/TaskQueryParams\"}\n  },\n  \"required\": [\n    \"method\",\n    \"params\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskResubscriptionRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"tasks/resubscribe\",\n  \"const\": \"tasks/resubscribe\",\n  \"title\": \"Method\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskResubscriptionRequest_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskResubscriptionRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskResubscriptionRequest_Params(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskQueryParams\"}\n```\n\n"
		   });
		addAnnotation
		  (jsonrpcMessageEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"JSONRPCMessage\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCMessage_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getJSONRPCMessage_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (taskIdParamsEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskIdParams\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"id\": {\n      \"title\": \"Id\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\"id\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskIdParams_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskIdParams_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Id\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (taskNotCancelableErrorEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskNotCancelableError\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"code\": {\n      \"default\": -32002,\n      \"const\": -32002,\n      \"examples\": [-32002],\n      \"description\": \"Error code\",\n      \"title\": \"Code\",\n      \"type\": \"integer\"\n    },\n    \"data\": {\n      \"default\": null,\n      \"const\": null,\n      \"title\": \"Data\"\n    },\n    \"message\": {\n      \"default\": \"Task cannot be canceled\",\n      \"const\": \"Task cannot be canceled\",\n      \"examples\": [\"Task cannot be canceled\"],\n      \"description\": \"A short description of the error\",\n      \"title\": \"Message\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"code\",\n    \"message\",\n    \"data\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskNotCancelableError_Code(),
		   source,
		   new String[] {
			   "documentation", "Error code\r\n\r\n## Specification\n\n```json\n{\n  \"default\": -32002,\n  \"const\": -32002,\n  \"examples\": [-32002],\n  \"description\": \"Error code\",\n  \"title\": \"Code\",\n  \"type\": \"integer\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskNotCancelableError_Data(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"const\": null,\n  \"title\": \"Data\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskNotCancelableError_Message(),
		   source,
		   new String[] {
			   "documentation", "A short description of the error\r\n\r\n## Specification\n\n```json\n{\n  \"default\": \"Task cannot be canceled\",\n  \"const\": \"Task cannot be canceled\",\n  \"examples\": [\"Task cannot be canceled\"],\n  \"description\": \"A short description of the error\",\n  \"title\": \"Message\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (cancelTaskRequestEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"CancelTaskRequest\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"method\": {\n      \"default\": \"tasks/cancel\",\n      \"const\": \"tasks/cancel\",\n      \"title\": \"Method\",\n      \"type\": \"string\"\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"params\": {\"$ref\": \"#/$defs/TaskIdParams\"}\n  },\n  \"required\": [\n    \"method\",\n    \"params\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getCancelTaskRequest_Method(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"tasks/cancel\",\n  \"const\": \"tasks/cancel\",\n  \"title\": \"Method\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getCancelTaskRequest_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getCancelTaskRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getCancelTaskRequest_Params(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/TaskIdParams\"}\n```\n\n"
		   });
		addAnnotation
		  (getTaskPushNotificationResponseEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"GetTaskPushNotificationResponse\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"result\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/TaskPushNotificationConfig\"},\n        {\"type\": \"null\"}\n      ]\n    },\n    \"id\": {\n      \"anyOf\": [\n        {\"type\": \"integer\"},\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Id\"\n    },\n    \"jsonrpc\": {\n      \"default\": \"2.0\",\n      \"const\": \"2.0\",\n      \"title\": \"Jsonrpc\",\n      \"type\": \"string\"\n    },\n    \"error\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"$ref\": \"#/$defs/JSONRPCError\"},\n        {\"type\": \"null\"}\n      ]\n    }\n  }\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskPushNotificationResponse_Result(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/TaskPushNotificationConfig\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskPushNotificationResponse_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"anyOf\": [\n    {\"type\": \"integer\"},\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Id\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskPushNotificationResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": \"2.0\",\n  \"const\": \"2.0\",\n  \"title\": \"Jsonrpc\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getGetTaskPushNotificationResponse_Error(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"$ref\": \"#/$defs/JSONRPCError\"},\n    {\"type\": \"null\"}\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (taskArtifactUpdateEventEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"TaskArtifactUpdateEvent\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"artifact\": {\"$ref\": \"#/$defs/Artifact\"},\n    \"metadata\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\n          \"additionalProperties\": {},\n          \"type\": \"object\"\n        },\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Metadata\"\n    },\n    \"id\": {\n      \"title\": \"Id\",\n      \"type\": \"string\"\n    }\n  },\n  \"required\": [\n    \"id\",\n    \"artifact\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskArtifactUpdateEvent_Artifact(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\"$ref\": \"#/$defs/Artifact\"}\n```\n\n"
		   });
		addAnnotation
		  (getTaskArtifactUpdateEvent_Metadata(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\n      \"additionalProperties\": {},\n      \"type\": \"object\"\n    },\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Metadata\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getTaskArtifactUpdateEvent_Id(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Id\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (taskStateEEnum,
		   source,
		   new String[] {
			   "documentation", "An enumeration.\r\n\r\n## Specification\n\n```json\n{\n  \"description\": \"An enumeration.\",\n  \"title\": \"TaskState\",\n  \"type\": \"string\",\n  \"enum\": [\n    \"submitted\",\n    \"working\",\n    \"input-required\",\n    \"completed\",\n    \"canceled\",\n    \"failed\",\n    \"unknown\"\n  ]\n}\n```\n\n"
		   });
		addAnnotation
		  (agentProviderEClass,
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"AgentProvider\",\n  \"type\": \"object\",\n  \"properties\": {\n    \"organization\": {\n      \"title\": \"Organization\",\n      \"type\": \"string\"\n    },\n    \"url\": {\n      \"default\": null,\n      \"anyOf\": [\n        {\"type\": \"string\"},\n        {\"type\": \"null\"}\n      ],\n      \"title\": \"Url\"\n    }\n  },\n  \"required\": [\"organization\"]\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentProvider_Organization(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"title\": \"Organization\",\n  \"type\": \"string\"\n}\n```\n\n"
		   });
		addAnnotation
		  (getAgentProvider_Url(),
		   source,
		   new String[] {
			   "documentation", "## Specification\n\n```json\n{\n  \"default\": null,\n  \"anyOf\": [\n    {\"type\": \"string\"},\n    {\"type\": \"null\"}\n  ],\n  \"title\": \"Url\"\n}\n```\n\n"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (taskEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTask_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTask_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTask_SessionId(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTask_History(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTask_Status(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTask_Artifacts(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (unsupportedOperationErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getUnsupportedOperationError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getUnsupportedOperationError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getUnsupportedOperationError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (jsonrpcRequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCRequest_Method(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCRequest_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCRequest_Params(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskStatusUpdateEventEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskStatusUpdateEvent_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskStatusUpdateEvent_Final(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskStatusUpdateEvent_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskStatusUpdateEvent_Status(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (authenticationInfoEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAuthenticationInfo_Credentials(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAuthenticationInfo_Schemes(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (sendTaskStreamingResponseEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskStreamingResponse_Result(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskStreamingResponse_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskStreamingResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskStreamingResponse_Error(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskPushNotificationConfigEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskPushNotificationConfig_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskPushNotificationConfig_PushNotificationConfig(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (agentCardEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_Skills(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_DocumentationUrl(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_Capabilities(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_Provider(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_DefaultOutputModes(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_Name(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_Description(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_Version(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_DefaultInputModes(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_Url(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCard_Authentication(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (agentCapabilitiesEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCapabilities_Streaming(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCapabilities_PushNotifications(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentCapabilities_StateTransitionHistory(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (sendTaskRequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskRequest_Method(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskRequest_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskRequest_Params(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (jsonParseErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONParseError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONParseError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONParseError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (dataPartEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getDataPart_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getDataPart_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getDataPart_Type(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (invalidRequestErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInvalidRequestError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInvalidRequestError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInvalidRequestError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (a2ARequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskNotFoundErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskNotFoundError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskNotFoundError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskNotFoundError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (jsonrpcResponseEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCResponse_Result(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCResponse_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCResponse_Error(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (filePartEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getFilePart_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getFilePart_File(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getFilePart_Type(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskQueryParamsEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskQueryParams_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskQueryParams_HistoryLength(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskQueryParams_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (pushNotificationConfigEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getPushNotificationConfig_Url(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getPushNotificationConfig_Token(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getPushNotificationConfig_Authentication(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (partEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (internalErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInternalError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInternalError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInternalError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (agentAuthenticationEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentAuthentication_Credentials(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentAuthentication_Schemes(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (pushNotificationNotSupportedErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getPushNotificationNotSupportedError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getPushNotificationNotSupportedError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getPushNotificationNotSupportedError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskRequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskRequest_Method(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskRequest_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskRequest_Params(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (agentSkillEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentSkill_InputModes(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentSkill_OutputModes(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentSkill_Examples(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentSkill_Name(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentSkill_Description(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentSkill_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentSkill_Tags(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (messageEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getMessage_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getMessage_Role(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getMessage_Parts(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (sendTaskStreamingRequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskStreamingRequest_Method(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskStreamingRequest_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskStreamingRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskStreamingRequest_Params(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskPushNotificationRequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskPushNotificationRequest_Method(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskPushNotificationRequest_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskPushNotificationRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskPushNotificationRequest_Params(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (jsonrpcErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (invalidParamsErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInvalidParamsError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInvalidParamsError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getInvalidParamsError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (cancelTaskResponseEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getCancelTaskResponse_Result(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getCancelTaskResponse_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getCancelTaskResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getCancelTaskResponse_Error(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (sendTaskResponseEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskResponse_Result(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskResponse_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSendTaskResponse_Error(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (setTaskPushNotificationRequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSetTaskPushNotificationRequest_Method(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSetTaskPushNotificationRequest_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSetTaskPushNotificationRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSetTaskPushNotificationRequest_Params(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (textPartEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTextPart_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTextPart_Text(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTextPart_Type(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskResponseEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskResponse_Result(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskResponse_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskResponse_Error(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskSendParamsEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskSendParams_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskSendParams_HistoryLength(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskSendParams_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskSendParams_SessionId(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskSendParams_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskSendParams_PushNotification(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskStatusEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskStatus_State(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskStatus_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskStatus_Timestamp(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getArtifact_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getArtifact_LastChunk(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getArtifact_Name(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getArtifact_Parts(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getArtifact_Description(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getArtifact_Index(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getArtifact_Append(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (setTaskPushNotificationResponseEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSetTaskPushNotificationResponse_Result(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSetTaskPushNotificationResponse_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSetTaskPushNotificationResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getSetTaskPushNotificationResponse_Error(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (fileContentEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getFileContent_Bytes(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getFileContent_Name(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getFileContent_MimeType(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getFileContent_Uri(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (methodNotFoundErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getMethodNotFoundError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getMethodNotFoundError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getMethodNotFoundError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskResubscriptionRequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskResubscriptionRequest_Method(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskResubscriptionRequest_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskResubscriptionRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskResubscriptionRequest_Params(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (jsonrpcMessageEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCMessage_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getJSONRPCMessage_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskIdParamsEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskIdParams_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskIdParams_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskNotCancelableErrorEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskNotCancelableError_Code(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskNotCancelableError_Data(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskNotCancelableError_Message(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (cancelTaskRequestEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getCancelTaskRequest_Method(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getCancelTaskRequest_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getCancelTaskRequest_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getCancelTaskRequest_Params(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskPushNotificationResponseEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskPushNotificationResponse_Result(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskPushNotificationResponse_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskPushNotificationResponse_Jsonrpc(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getGetTaskPushNotificationResponse_Error(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskArtifactUpdateEventEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskArtifactUpdateEvent_Artifact(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskArtifactUpdateEvent_Metadata(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getTaskArtifactUpdateEvent_Id(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (taskStateEEnum,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (agentProviderEClass,
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentProvider_Organization(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
		addAnnotation
		  (getAgentProvider_Url(),
		   source,
		   new String[] {
			   "generated", "true"
		   });
	}

} //A2aPackageImpl
