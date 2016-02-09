package project.type1.msg;

public class ResMsg< T > {

	public static final String RESULT_CODE_SUCCESS	= "0000";
	
	private String	result_code;
	private String	result_msg;
	private T		body;
	
	public ResMsg(String result_code, String result_msg, T body) {
		super();
		this.result_code = result_code;
		this.result_msg = result_msg;
		this.body = body;
	}

	public String getResult_code() {
		return result_code;
	}

	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public String getResult_msg() {
		return result_msg;
	}

	public void setResult_msg(String result_msg) {
		this.result_msg = result_msg;
	}

	@Override
	public String toString() {
		return "ResMsg [result_code=" + result_code + ", result_msg="
				+ result_msg + ", body=" + body + "]";
	}
	
}
