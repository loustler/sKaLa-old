# Immutable Object

-   장점
    -   시간에 따라 변하는 상태 공간을 가지고 있지 않아 추론이 쉬움
    -   전달을 비교적 자유롭게 할 수 있음
    -   Multi Thread 환경에서도 상태가 변할 일이 없음
    -   안전한 Hash table의 key다(Safety key for Hash table)
-   단점
    -   거대한 객체 그래프를 복사해야 됨
        -   특정 시점에서 메모리에서 객체들 사이의 참조 관계
    -   성능상의 병목(BottleNeck)이 나타날 수 있음