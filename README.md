# 프로젝트 목표

이 레포지토리는 의도적으로 Java Virtual Machine의 OOM(OutOfMemoryError)을 발생시킨 뒤, 힙 덤프(heap dump)를 생성하여 이를 분석함으로써 메모리 사용 패턴, 메모리 누수, 객체 점유 현황 등을 학습하고자 합니다.

# 관련 포스트

https://hello-world-juno.tistory.com/4

# 실습 방법
1. Eclipse Memory Analyzer (MAT) 설치 후 실행합니다.
2. vm 설정을 통해 메모리를 제한하고 OOM 발생시 힙덤프 옵션을 설정합니다.
3. 스프링 어플리케이션을 실행시킵니다.
4. `http://localhost:8080/simulation/photo-cache/oom?id=1` 로 요청을 보내 OOM을 발생시킵니다.
5. MAT 의 메모리 분석 기능을 통해 어디서 메모리 누수가 발생했는지 체크합니다.
6. 디버깅을 해봅니다.

MAT에서 메모리 점유율을 확인해 볼 수 있습니다.
<img width="480" height="308" alt="image" src="https://github.com/user-attachments/assets/3c20bd90-148f-450f-947d-b0722e7b2775" />
