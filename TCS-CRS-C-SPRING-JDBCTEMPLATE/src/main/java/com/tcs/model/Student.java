package com.tcs.model;


	public class Student {
		
		private Integer studentid;
		private String studentname;
		private Integer studentphone;
		private String studentemail;
		
		public Integer getStudentid() {
			return studentid;
		}
		public void setStudentid(Integer studentid) {
			this.studentid = studentid;
		}
		public String getStudentname() {
			return studentname;
		}
		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}
		public Integer getStudentphone() {
			return studentphone;
		}
		public void setStudentphone(Integer studentphone) {
			this.studentphone = studentphone;
		}
		public String getStudentemail() {
			return studentemail;
		}
		public void setStudentemail(String studentemail) {
			this.studentemail = studentemail;
		}
		
		@Override
		public String toString() {
			return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentphone=" + studentphone
					+ ", studentemail=" + studentemail + "]";
		}
}


