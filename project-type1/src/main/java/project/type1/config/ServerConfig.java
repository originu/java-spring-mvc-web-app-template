package project.type1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ServerConfig {

	@Value("${PROJECT_HOME}")		private FileSystemResource projectHome;

	@Value("${server.id}")			private String serverId;
	@Value("${server.version}")		private String serverVersion;

	
	public String getServerId() {
		return serverId;
	}
	public String getServerVersion() {
		return serverVersion;
	}
	public FileSystemResource getProjectHome() {
		return projectHome;
	}
	
}
