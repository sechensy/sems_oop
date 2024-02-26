package task3;

public interface Game {
    void start(Integer sizeWord,Integer tryCount);

    Answer inputValue(String value);

    GameStatus getGameStatus();

//    GameStatus gameStatus = GameStatus.INIT;
}
