package com.citytechinc.cq.component.editconfig.actionconfigs;

import com.citytechinc.cq.component.util.Constants;
import com.citytechinc.cq.component.xml.XmlElementParameters;

public class EditConfigActionConfigsParameters extends XmlElementParameters {
	@Override
	public String getNameSpace() {
		return Constants.CQ_NS_URI;
	}

	@Override
	public void setNameSpace(String nameSpace) {
		throw new UnsupportedOperationException("nameSpace is Static for EditConfigActionConfifs");
	}

	@Override
	public String getFieldName() {
		return "cq:actionConfigs";
	}

	@Override
	public void setFieldName(String fieldName) {
		throw new UnsupportedOperationException("fieldName is Static for EditConfigActionConfifs");
	}

	@Override
	public String getPrimaryType() {
		return Constants.NT_UNSTRUCTURED;
	}

	@Override
	public void setPrimaryType(String primaryType) {
		throw new UnsupportedOperationException("PrimaryType is Static for EditConfigActionConfifs");
	}
}
