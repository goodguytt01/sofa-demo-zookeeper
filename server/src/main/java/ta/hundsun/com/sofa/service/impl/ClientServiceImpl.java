package ta.hundsun.com.sofa.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ta.hundsun.com.sofa.dao.ClientDAO;
import ta.hundsun.com.sofa.dto.ClientDTO;
import ta.hundsun.com.sofa.entity.CliClient;
import ta.hundsun.com.sofa.service.ClientService;

import java.util.ArrayList;
import java.util.List;

@Component
@SofaService(interfaceType = ClientService.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;

    @Override
    public List<ClientDTO> getClients() {
        List<CliClient> clients =  clientDAO.getClients();
        List<ClientDTO> result = new ArrayList<>();
        if(clients!=null&&clients.size()>0){
            for(CliClient client:clients){
                if(client!=null){
                    ClientDTO clientDTO = new ClientDTO();
                    BeanUtils.copyProperties(client,clientDTO);
                    result.add(clientDTO);
                }
            }
        }
        return result;
    }
}
