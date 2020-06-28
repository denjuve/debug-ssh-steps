properties([
    parameters([
        string(name: 'ssh_creds', defaultValue: 'ubuntu_ssh', description: 'ssh credentials id for target node'),
        string(name: 'rhost_ip', defaultValue: '10.5.1.177', description: 'target mon node ip address'),
         string(name: 'git_branch_mon', defaultValue: 'master', description: 'mon git branch/tag name'),
        string(name: 'ci_branch_mon', defaultValue: 'master', description: 'mon ci git branch/tag name'),
    ])
])

//string vars{
def String nodeIp
nodeIp = "${params.rhost_ip}"
string s_dir = "repo/containerization/monitoring_platform"
string d_dir = "mon1"
string cmpt_id = "mon_"
//}
node {
def remote = [:]
remote.name = nodeIp
remote.host = nodeIp
remote.allowAnyHosts = true

  withCredentials([sshUserPrivateKey(credentialsId: "${params.ssh_creds}", keyFileVariable: 'identity', passphraseVariable: '', usernameVariable: 'userName'),
      usernamePassword(credentialsId: '5gt-ci', usernameVariable: 'u5g', passwordVariable: 'p5g')
]) {
        remote.user = userName
        remote.identityFile = identity
stage('1') {
    sshCommand remote: remote, command: "ls -l"

} //stage
} // withcredential
} //node
