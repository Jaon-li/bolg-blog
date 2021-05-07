mvn clean package
scp target/blog-blog-0.0.1-SNAPSHOT.jar tx:/data/server/blog/blog
ssh tx "cd /data/server/blog/blog;source /etc/profile;sh start.sh"

