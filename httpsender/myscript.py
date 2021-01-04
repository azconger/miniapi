headers = dict({
  "User-Agent": "AAAAAAAAAAHHHHHHH",
  "Server": "AAAAAAAAAAHHHHHHH"
})

def sendingRequest(msg, initiator, helper):
  for x in list(headers):
    msg.getRequestHeader().setHeader(x, headers[x]);


def responseReceived(msg, initiator, helper):
  for x in list(headers):
    msg.getResponseHeader().setHeader(x, headers[x])
