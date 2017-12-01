require "socket"

loadbalancer=TCPServer.open("192.168.175.129",2000)
while true
client=loadbalancer.accept
rhost=client.peeraddr.last
puts "#message from client: #{fromclient}"
if fromclient=="fat"
sockettoserver1=TCPSocket.open("192.168.15.128",3000)
sockettoserver1.write(fromclient)
sockettoserver1.close

else if fromclient=="thin"
sockettoserver2=TCPSocket.open("192.168.15.129",4000)
sockettoserver2.write(fromclient)
sockettoserver2.close

else 
puts "ERROR"

end
end
end
