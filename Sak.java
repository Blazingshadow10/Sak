public class Sak {
    public static void main(String[] args) {
        System.out.println("");
		if (args.length == 0) {
			System.out.println("Please use one of the listed commands below. You can pull up this information again with \"-Help\"." );
			Help.printHelp();		 
		} 
		else if (args[0].equalsIgnoreCase("-Help")) {
			System.out.println("Executing Help...");
			Help.printHelp();		  
		} 
		else if (args[0].equalsIgnoreCase("-HttpRequest")) {
			if (args.length != 2) {
				System.out.println("Error:\nNo Valid Url found in command.");
			} else {
				System.out.println("Executing HttpRequest...");
				String requestedURL = args[1];
				HttpRequest Httprequest = new HttpRequest();
				if (Httprequest.readURL(requestedURL)) {
					System.out.println(Httprequest);
				}
			}
		}
		else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {	
			if (args.length != 2) {
				System.out.println("Error:\nNo Valid Url found in command.");
			} else {
				System.out.println("Executing HttpRequestIndex...");
				String indexedURL = args[1];
				HttpRequestIndex requestIndex = new HttpRequestIndex(indexedURL);
				if (requestIndex.readURL(indexedURL)) {
					System.out.println(indexedURL);
			}
		}
		System.out.println("");
    }
}
}
