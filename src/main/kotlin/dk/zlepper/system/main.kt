package dk.zlepper.system

import java.nio.file.Files
import java.nio.file.Paths
import javax.script.ScriptEngineManager


fun main(args: Array<String>) {


    System.setProperty("idea.use.native.fs.for.win", "false")
    with(ScriptEngineManager().getEngineByExtension("kts")) {
        val scriptReader = Files.newBufferedReader(Paths.get("scripts/script.kts"))
        val res = eval(scriptReader)
        if (res is Job) {
            res.run()
        } else {
            println(res)
        }
    }
}