package com.example.demo.ui.model.response;

public enum ErrorMessages {
	
	MISSING_REQUIRED_FIELD("missing required field please check documentatation for field"),
	RECORED_ALREADY_EXISTS("record already exists"),
	INTERNAL_SERVER_ERROR("internal server error"),
	NO_RECORD_FOUND("record with provoided id not found"),
	AUTHENTICATION_FAILED("authentiction failed"),
	COULD_NOT_UPDATE_RECORD("could not update record"),
	COULD_NOT_DELETE_RECORD("could not delete record"),
	EMAIL_ADDRESS_NOT_VERIFIED("email address could not be verified");
	
	
	private String errorMessage;
	
	ErrorMessages(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}

