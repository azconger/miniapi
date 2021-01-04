val headers = dict({"X-XXX-XX-X": "AAAAAAAAAAHHHHHHH"})
//
//fun sendingRequest(msg, initiator, helper):
//  for x in list(headers):
//    msg.getRequestHeader().setHeader(x, headers[x]);
//
//
//def responseReceived(msg, initiator, helper):
//  for x in list(headers):
//    msg.getResponseHeader().setHeader(x, headers[x])

fun sendingRequest(msg, initiator, helper) {
  val url = URL("http://www.google.com/")

  with(url.openConnection() as HttpURLConnection) {
    requestMethod = "GET"  // optional default is GET

    println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

    inputStream.bufferedReader().use {
      it.lines().forEach { line ->
        println(line)
      }
    }
  }
}
