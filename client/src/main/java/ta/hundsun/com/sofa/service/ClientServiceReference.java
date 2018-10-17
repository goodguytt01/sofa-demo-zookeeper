package ta.hundsun.com.sofa.service;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import org.springframework.stereotype.Component;
import ta.hundsun.com.sofa.dto.ClientDTO;

import java.util.List;

@Component
public class ClientServiceReference {

    @SofaReference(interfaceType = ClientService.class, jvmFirst = false, binding = @SofaReferenceBinding(bindingType = "bolt"))
    ClientService clientService;

    public List<ClientDTO> getClients(){
        return clientService.getClients();
    }
}
