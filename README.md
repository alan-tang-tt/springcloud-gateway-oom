1. run springboot Application
2. run Springcloud-gateway Application with `-Dio.netty.allocator.type=unpooled`
3. send a requet  http://localhost:8080/test , get or post either is ok
4. observe the console metrics log
5. repeat the 3rd and 4th steps