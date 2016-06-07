package org.jcs.dss.op;

import org.jcs.dss.main.DssConnection;

public class DeleteObjectOp extends ObjectOp{

	public DeleteObjectOp(DssConnection conn, String bucketName, String objectName) {
		super(conn, bucketName, objectName);
		// TODO Auto-generated constructor stub
		httpMethod="DELETE";
		opPath = '/' + bucketName + '/' + objectName;
	}

}