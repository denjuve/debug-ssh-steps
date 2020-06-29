package com.libs

def func(r_ip)

def remote = [:]
remote.name = "${r_ip}"
remote.host = "${r_ip}"
remote.allowAnyHosts = true

  withCredentials([sshUserPrivateKey(credentialsId: ssh_creds, keyFileVariable: 'identity', passphraseVariable: '', usernameVariable: 'userName'),
      usernamePassword(credentialsId: '5gt-ci', usernameVariable: 'u5g', passwordVariable: 'p5g')]) {
        remote.user = userName
        remote.identityFile = identity


sshCommand remote: remote1, command: "ls -l"

}
return this
