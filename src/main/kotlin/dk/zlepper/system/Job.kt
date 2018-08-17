package dk.zlepper.system

abstract class Job {
    abstract fun run()
}

fun <T : Job> createJob(j: T): T {
    return j
}