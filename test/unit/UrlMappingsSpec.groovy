import com.vega.demo.ZipCodeController
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import org.codehaus.groovy.grails.web.mapping.UrlMappings
import spock.lang.Specification

@TestFor(UrlMappings)
@Mock(ZipCodeController)
class UrlMappingsSpec extends Specification {

    void "test zip code mapping"() {
        expect:
        assertForwardUrlMapping("/api/address/zip-code/12345", controller: 'zipCode', action: "show")
    }

}
