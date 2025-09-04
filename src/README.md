# 테스트 코드 쓰는 이유
1. 초기에 문제를 발견
2. 업그레이드 등에서 기존 기능이 올바르게 작동하는지 확인
3. 불확실성을 감소
4. 문서화

# 테스트 코드
1. 빠른 피드백
2. 자동 검증
3. 개발자가 만든 기능을 안전하게 보호

# 테스트 코드 프레임워크
- JUnit5 - java

# 프로젝트 구조
- build.gradle:
  - 역할 : 프로젝트 빌드 설정, 의존성 관리, 룸북 포함
- HelloController.java
  - 역할 : HTTP 요청 처리 |, AP; 엔트포인트 제공
  - 동작의 흐름:
    - 브라우저 요청: GET/hello
    - helloController.hello()
    - hello 문자열 반환
    - 브라우저에 hello 표기
- HelloResponseDto.java
  - 역할 : APL 응답 시 데이터를 담는 객체