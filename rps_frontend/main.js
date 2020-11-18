const {app, BrowserWindow} = require('electron');
const kill = require('kill-port');

const createWindow = () => {
  const win = new BrowserWindow({
    width: 800,
    height: 600,
    webPreferences: {
      nodeIntegration: true
    }
  });
  
  win.loadFile('index.html');
  
  win.on('closed', () => {
    console.log("closing down");
    kill(8080, 'tcp')
      .then(console.log("killed port 8080"));
  })
}

const jarPath = app.getAppPath() + '/rps_backend-0.0.1-SNAPSHOT.jar';
console.log("jarPath:", jarPath);
const child = require('child_process').spawn(
  'java', ['-jar', jarPath, '']
  );
  
app.whenReady().then(createWindow);
  
app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') {
    app.quit();
  }
});
  
app.on('activate', () => {
  if (BrowserWindow.getAllWindows().length === 0) {
    createWindow();
  }
});