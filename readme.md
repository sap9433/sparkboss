SPARK

        ssh -i ~/Documents/Download\ Folder/Software/sapedu.pem ec2-user@ec2-3-90-87-40.compute-1.amazonaws.com


service docker start and docker info.(z_123456)

http://ec2-3-90-87-40.compute-1.amazonaws.com:8080/#/login

4200 -> root / hadoop

ambari-admin-password-reset




docker container stop $(docker container ls -aq)
docker container rm $(docker container ls -aq)


cat ~/.ssh/id_rsa.pub | ssh root@localhost -p 2222 'cat >> .ssh/authorized_keys'
