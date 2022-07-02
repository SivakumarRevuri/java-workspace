package dependencyinjection;

public class Engine {
		private String modelNo;
		
		public Engine() {
			System.out.println("I am Engine constructor....");
		}

		public String getModelNo() {
			return modelNo;
		}

		public void setModelNo(String modelNo) {
			this.modelNo = modelNo;
		}
		
}
