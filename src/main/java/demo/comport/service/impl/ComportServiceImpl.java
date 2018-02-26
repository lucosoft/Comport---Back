package demo.comport.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fazecast.jSerialComm.SerialPort;

import demo.comport.model.Comport;
import demo.comport.service.ComportService;

@Service
public class ComportServiceImpl implements ComportService {

	@Override
	public List<Comport> getComPort() {

		List<Comport> list = new ArrayList<>();
		SerialPort[] portNames = SerialPort.getCommPorts();
		for (int i = 0; i < portNames.length; i++) {
			list.add(new Comport(portNames[i].getSystemPortName()));
		}
		return list;
	}

}
