package ta.hundsun.com.sofa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ta.hundsun.com.sofa.entity.CliClient;
import ta.hundsun.com.sofa.mapper.CliClientMapper;

import java.util.List;

@Component
public class ClientDAO {

    @Autowired
    private CliClientMapper cliClientMapper;

    public List<CliClient> getClients(){
        return cliClientMapper.selectAll();
    }

}
