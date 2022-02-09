# kafka-example
kafka example

## kafa 다운로드 및 설치
* Kafka 안내 https://kafka.apache.org/downloads
* Download https://www.apache.org/dyn/closer.cgi?path=/kafka/3.1.0/kafka_2.13-3.1.0.tgz
> kafka 공식 홈페이지에서 다운로드를 받는다. 그리고 다운받은 파일은 적당한 곳에서 압축을 풀어 준다.
> 압축을 풀고 bin\windows 폴더로 진입을 한다. 배치파일이 보이고 그리고 cmd 또는 powershell 로 실행한다.

## kafka 실행
> 실행을 하기 앞서 이해를 돕기 위한 간단하 개념을 알아야 한다. kafka에서 사용되는 용어들인데 Broker는 kafka의 서버를 뜻하며
> 동일 노드 내에서 여러개의 Broker를 띄울 수 있다. 그리고 이렇게 분산되어서 여러개의 Broker가 띄워져 있으며 이 분산 Message Queue를
> 관리해주는 역할을 하는것이 Zookeeper이다. kafka 서버를 띄우기 앞서 Zookeeper를 반드시 띄워야 한다.

## Zookeeper 실행
`.\zookeeper-server-start.bat ..\..\config\zookeeper.properti`
> 위의 명령어를 실행하면 이상태로 놔두고 새로운 cmd로 kafka 서버를 실행한다.

## kafka 서버 실행
`.\kafka-server-start.bat ..\..\config\server.properties`
> 위의 zookeeper를 실행시킨것과 마찬가지로 kafka 서버를 실행시킨다. zookeeper를 실행시켰을때보다 kafka Config를 읽어들이는 것을 비롯해
> 더 많은 양의 로그가 출력이 되는 것을 확인할 수 있다.

## 실행 확인
`netstat -a`
- 2181 port, 9092 port 실행 되는걸 확인 한다.
- 2181 port zookeeper
- 9092 port kafka default port

## 이벤트 읽기
https://kafka.apache.org/quickstart#quickstart_consume
`.\bin/kafka-console-consumer.bat --topic doyoungcode --from-beginning --bootstrap-server localhost:9092`
> 위 명령어를 cmd에서 실행





