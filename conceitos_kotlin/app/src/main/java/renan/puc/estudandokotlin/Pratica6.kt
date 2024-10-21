package renan.puc.estudandokotlin
import kotlinx.coroutines.*

// Pratica coroutine
suspend fun doSomething(delayTime: Long, message: String) {
    delay(delayTime);
    println(message);
}

fun main(){
    val job1 = GlobalScope.launch {
        doSomething(1000, "Tarefa 1 completa");
    }
    val job2 = GlobalScope.launch {
        doSomething(500, "Tarefa 2 completa");
    }
    val job3 = GlobalScope.launch {
        doSomething(2000, "Tarefa 3 completa");
    }

    runBlocking {
        job1.join();
        job2.join();
        job3.join();
    }

}