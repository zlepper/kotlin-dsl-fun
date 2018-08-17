import dk.zlepper.system.*

createJob(object : Job() {
    override fun run() {
        println("Hello from the script!")
    }
})