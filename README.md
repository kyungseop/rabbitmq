# 프로젝트 테스트 용도

Syslog -> Logstash -> RabbitMQ -> Spring boot 순으로 메세지가 전달되는 것 테스트

# Logstash 실행

공식홈페이지에서 다운로드 후 설치경로\bin 폴더에서 logstash -f "설정파일" 실행
ex ) logstash -f logstash-syslog.conf

# RabbitMQ 설치 및 실행

공식홈페이지 
- windows : https://cmatskas.com/getting-started-with-rabbitmq-on-windows

Queue 와 Exchange 를 Logstash 와 Spring boot 에 설정한 것으로 맞출 것

