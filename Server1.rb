require "socket"

while true
server=TCPServer.open("192.168.15.128",3000)
loadbalancer=server.accept
puts loadbalancer.close
server.close
end
