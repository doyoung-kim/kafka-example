# 가상머신 설정

## 설치 방법
* 오라클 VirtualBox 다운로드
* https://www.virtualbox.org/wiki/Downloads
> 해당 OS 버전 설치


## 네트워크 설정
1. 환경 설정 클릭 > 네트워크 > 추가
2. 네트워크 이름 설정 > 우 클릭 > NAT 네트워크 편집 > 
3. 네트워크 대역 설정
* 네트워크  CIDR 10.100.0.0/24
* 네트워크 옵션 CHCP 지원 클릭
4. 포트 포에딩 클릭

| 이름 | 프로토콜 | 호스트 IP |  호스트 포트 | 게스트 IP | 게스트 포트 |
| ------ | ------ | ------ | ------ | ------ | ------ |
| docker1 | TCP | 127.0.0.1 | 105 | 10.100.0.105 | 22 |
| docker2 | TCP | 127.0.0.1 | 106 | 10.100.0.106 | 22 |


## Ubuntu 설정
1. 패스워드 설정
> sudo passwd root
* root 패스워드는 12345 설정

2. SSH 서버 설치 후 운영
* apt-get update
* apt-get install -y openssh-server curl vim tree
* putty && putty manager 설치



