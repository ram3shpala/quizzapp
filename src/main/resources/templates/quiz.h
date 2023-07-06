<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Quiz</title>
    <link rel="stylesheet" type="text/css" href="/css/quiz.css">
</head>
<body>
    <div class="quiz-container" th:if="${quizStarted}">
        <h2 class="quiz-question" th:text="${currentQuestion.question}"></h2>
        
        <div class="quiz-options">
            <label>
                <input type="radio" th:name="answer" th:value="${currentQuestion.option1}" />
                <span th:text="${currentQuestion.option1}"></span>
            </label>
            <label>
                <input type="radio" th:name="answer" th:value="${currentQuestion.option2}" />
                <span th:text="${currentQuestion.option2}"></span>
            </label>
            <label>
                <input type="radio" th:name="answer" th:value="${currentQuestion.option3}" />
                <span th:text="${currentQuestion.option3}"></span>
            </label>
            <label>
                <input type="radio" th:name="answer" th:value="${currentQuestion.option4}" />
                <span th:text="${currentQuestion.option4}"></span>
            </label>
        </div>
        
        <div class="quiz-navigation">
            <button class="quiz-button" onclick="previousQuestion()" th:disabled="${currentQuestionIndex == 0}">Previous</button>
            <button class="quiz-button" onclick="nextQuestion()" th:if="${currentQuestionIndex < quizSize - 1}">Next</button>
            <button class="quiz-button quiz-finish" onclick="finishQuiz()" th:if="${currentQuestionIndex == quizSize - 1}">Finish</button>
        </div>
    </div>
    
    <script th:inline="javascript">
        var currentQuestionIndex = /*[[${currentQuestionIndex}]]*/ 0;
        var quizSize = /*[[${quizSize}]]*/ 0;
        
        function previousQuestion() {
            currentQuestionIndex--;
            /* Code to update and display the previous question */
        }
        
        function nextQuestion() {
            currentQuestionIndex++;
            /* Code to update and display the next question */
        }
        
        function finishQuiz() {
            /* Code to finish the quiz and display the score */
        }
    </script>
</body>
</html>
