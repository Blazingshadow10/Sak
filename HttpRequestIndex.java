public class HttpRequestIndex extends HttpRequest {

    public HttpRequestIndex() {
    }

    public HttpRequestIndex(String url) {

        HttpRequest requestIndex = new HttpRequest();

        if (requestIndex.readURL(url)) {
            String urlString = requestIndex.toString();
            String[] urlData = urlString.split("\"");
            System.out.println(requestIndex);

            for(int i = 0; i <= urlData.length; i++) {
                String requestURL = urlData[i];
                HttpRequest Httprequest = new HttpRequest();

                if (Httprequest.readURL(requestURL)) {
                    System.out.println(Httprequest);
                }
            }
        }
    }
}
