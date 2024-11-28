enum TrafficSignal{
	RED{
		public String getAction(){
			return "Stop";
		}
	}
	GREEN{
		public String getAction(){
			return "Go";
		}
	}
	YELLOW{
		public String getAction(){
			return "caution";
		}
	}
	public abstract String getAction();
}