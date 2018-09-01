package com.owner.heart.result;

public class Result {

	private boolean success ;
	public String getMsg() {
		return msg;
	}

	public Object getObj() {
		return obj;
	}

	private String msg;
	private Object obj;
	public boolean getSuccess() {
		return success;
	}

	private Result(boolean flag, String msg, Object obj ) {
		this.success=flag;
		this.msg=msg;
		this.obj=obj;
	}
	 public static Result success(){
			return new Result(true,null,null);
		}
		public static Result failure(){
			return new Result(false,null,null);
		}
		
		public static Result success(String msg){
			return new Result(true,msg,null);
		}
		
		public static Result failure(String msg){
			return new Result(false,msg,null);
		}
		public static Result failure(String msg,Object obj){
			return new Result(false,msg,obj);
		}
		public static Result success(String msg,Object obj){
			return new Result(true,msg,obj);
		}
//		public String  toJson(){
//			return new JSONObject(this, 1).toString();
//		}
//		public String  toJson(int level){
//			return new JSONObject(this, 1).toString();
//		}
//		public void  toJson(ServletResponse response) {
//			try{
//				response.setContentType("text/html");
//				response.getWriter().write( new JSONObject(this, 1).toString());
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		//上传文件的返回
//		public static void renderHtml(final String html, HttpServletResponse response,final String... headers) {
//			Struts2Utils.renderHtml(html, response, headers);
//		}
}
