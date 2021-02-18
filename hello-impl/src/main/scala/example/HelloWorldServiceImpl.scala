package example
import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.ServiceCall

import scala.concurrent.Future

class HelloWorldServiceImpl extends HelloWorldService {

  override def hello: ServiceCall[NotUsed, String] = ServiceCall { r =>
    Future.successful("Hello world")
  }

}
