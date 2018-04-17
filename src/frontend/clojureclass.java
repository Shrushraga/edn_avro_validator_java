package frontend;
import clojure.lang.PersistentVector;
import coding.backend;

class clojureclass{
	
	 String gotcontext = null;
	 String gotconcept = null;
	public   PersistentVector display(String f)
	{
		 backend.extract_dir_from_jar(f, "algorithms", "new dir");
	     PersistentVector result = backend.all_files();
	     
		return result;
	}
	public boolean flagfunction()
	{
		boolean flag = backend.validateid();
		if(flag == true)
		return true;
		return false;
	}
	public static void main(String args[])
	{
		System.out.println("Main");
		clojureclass o = new clojureclass();
		o.display("C:\\Users\\ss056651\\Documents\\app-rules-5.0.0.jar");
		boolean r = o.flagfunction();
		System.out.println(r);
	}
}